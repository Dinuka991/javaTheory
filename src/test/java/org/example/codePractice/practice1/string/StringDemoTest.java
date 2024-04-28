package org.example.codePractice.practice1.string;

import junit.framework.TestCase;

public class StringDemoTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testReverseString() {
        assertEquals(StringDemo.reverseString("amma"),"amma");
    }

    public void testAreAnagrams() {
    }
}