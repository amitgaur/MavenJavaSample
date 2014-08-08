package com.mycompany.app;

        import org.junit.Before;
        import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 8/8/14
 * Time: 11:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class FibTest {

    private Fib fib;
    @Before
    public void setup(){

                   fib = new Fib();
    }

    @Test
    public void testFib(){
                 fib.compute(0);
                 fib.compute(1);
                 System.out.println(fib.compute(55));
        System.out.println(fib.compute(33));


    }
}
