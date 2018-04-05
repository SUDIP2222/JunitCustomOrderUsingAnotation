import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(OrderedRunner.class)
public class TestDemo {

    @Test
    @Order(order = 2)
    public void two() {
        System.out.println("two");
    }

    @Test
    @Order(order = 4)
    public void four() {
        System.out.println("four");
    }

    @Test
    @Order(order = 3)
    public void three() {
        System.out.println("three");
    }

    @Test
    @Order(order = 5)
    public void five() {
        System.out.println("five");
    }

    @Test
    @Order(order = 1)
    public void one() {
        System.out.println("one");
    }

}
