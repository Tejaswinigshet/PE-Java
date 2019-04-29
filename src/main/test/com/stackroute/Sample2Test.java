package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Sample2Test
{
    Sample2 s2;
    @Before
    public void setUp() throws Exception {
         s2 = new Sample2();
    }

    @After    public void tearDown() throws Exception {
    }

    @Test
    public void stringDemo()
    {
        String str3 = s2.stringDemo();
        assertEquals("TEJASWINI", str3);
    }

    @Test
    public void checkNull()
    {
        boolean res = s2.checkNull();
        assertEquals(true,res);
    }
}
