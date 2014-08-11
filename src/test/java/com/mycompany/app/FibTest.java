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
        long start = System.nanoTime();
        fib.compute(55);
        long end = System.nanoTime();
        System.out.println("Comp1" + Long.toString(end-start));
        start = System.nanoTime();
        fib.compute2(55);
        end = System.nanoTime();
        System.out.println("Comp2" + Long.toString(end-start));

    }
}
