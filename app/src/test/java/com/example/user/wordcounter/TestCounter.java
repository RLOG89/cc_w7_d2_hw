package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 08/11/2016.
 */

public class TestCounter {

    Counter counter;

    @Before
    public void before(){
        counter = new Counter("Testing the length of this string");
    }

    @Test
    public void testCountStrLength() {
        Integer i = 6;
        assertEquals(i, counter.getStrCount());
    }
}
