import com.microsoft.demo.Demo;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(false);
    }

    @Test
    public void test_method_2() {
        // assert something wrong
        assertEquals(0, tester.multiply(10, 2), "10 x 2 must be 0");
    }
    
    @Test
    public void test_method_3() {
    }
}
