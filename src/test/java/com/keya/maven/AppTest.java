package com.keya.maven;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
//import org.junit.Assert.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Integer a=3,b=2,c,expected;

    @Test

    public void testAddition(){

        c=a+b;
        expected=5;
        //assertEquals(c , expected);
        //System.out.println(c);
        assertEquals(expected,c);
    }

    @Test

    public void testSubtraction(){
        c=a-b;
        expected=1;
        assertEquals(expected,c);
    }

    @Test

    public void testMultiplication(){
        c=a*b;
        expected=6;
        assertEquals(expected,c);
    }

    @Test

    public void testDivision(){
        double m=3;
        double n=2;
        double d=m/n;
        double expected=1.5;
        double DELTA = 1e-15;
        assertEquals(d,expected,DELTA);

    }

    @Test

    public void testModulo() {
        double m = 3;
        double n = 2;
        double d = m % n;
        double expected = 1;
        double DELTA = 1e-15;
        assertEquals(d, expected, DELTA);
    }


}
