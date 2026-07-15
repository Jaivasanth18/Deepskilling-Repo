package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app;

    @Before
    public void setUp(){
        app = new App();
    }

    @After 
    public void tearDown(){
        app = null;
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testAdd(){
        int a=10,b=20;
        int result = app.add(a,b);
        assertEquals(30, result);
    }

    @Test
    public void testSubtract(){
        int a=5,b=3;
        int result = app.subtract(a,b);
        assertEquals(2, result);
    }

    @Test
    public void testGreet(){
        String result = app.greet("World");
        assertEquals("Hello, World!", result);
    }
}
