package org.example.codePractice;

import junit.framework.TestCase;

public class PrimeCheckerTest extends TestCase {

    PrimeChecker pm = new PrimeChecker();
    public void testIsPrime() {
        assertFalse(pm.isPrime(1));
    }
}