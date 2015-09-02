package cmu.defect4j.math3.primes;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PrimesTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testNextPrime() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.primes.PrimesTest object = new org.apache.commons.math3.primes.PrimesTest();
               object.testNextPrime();
        }
    }

    @Test(timeout=1800000)
    public void testIsPrime() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.primes.PrimesTest object = new org.apache.commons.math3.primes.PrimesTest();
               object.testIsPrime();
        }
    }

    @Test(timeout=1800000)
    public void testPrimeFactors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.primes.PrimesTest object = new org.apache.commons.math3.primes.PrimesTest();
               object.testPrimeFactors();
        }
    }

}