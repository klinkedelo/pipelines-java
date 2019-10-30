package junitfaq;
 
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import com.microsoft.demo.Demo;
import org.junit.Test;
import static org.junit.Assertions.assertEquals;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(false);
    }

    @Test
    public void test_method_2() {
        MyClass tester = new MyClass();
        // assert something wrong
        assertEquals(0, tester.multiply(10, 2), "10 x 2 must be 0");
    }
    
    @Test
    public void test_method_3() {
    }
}
