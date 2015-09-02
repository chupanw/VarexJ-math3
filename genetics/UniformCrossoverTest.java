package cmu.defect4j.math3.genetics;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class UniformCrossoverTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testCrossover() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.UniformCrossoverTest object = new org.apache.commons.math3.genetics.UniformCrossoverTest();
               object.testCrossover();
        }
    }

    @Test(timeout=1800000)
    public void testCrossoverDimensionMismatchException() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.genetics.UniformCrossoverTest object = new org.apache.commons.math3.genetics.UniformCrossoverTest();
               object.testCrossoverDimensionMismatchException();
        }
    }

    @Test(timeout=1800000)
    public void testCrossoverInvalidFixedLengthChromosomeFirst() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.genetics.UniformCrossoverTest object = new org.apache.commons.math3.genetics.UniformCrossoverTest();
               object.testCrossoverInvalidFixedLengthChromosomeFirst();
        }
    }

    @Test(timeout=1800000)
    public void testCrossoverInvalidFixedLengthChromosomeSecond() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.genetics.UniformCrossoverTest object = new org.apache.commons.math3.genetics.UniformCrossoverTest();
               object.testCrossoverInvalidFixedLengthChromosomeSecond();
        }
    }

    @Test(timeout=1800000)
    public void testRatioTooLow() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.genetics.UniformCrossoverTest object = new org.apache.commons.math3.genetics.UniformCrossoverTest();
               object.testRatioTooLow();
        }
    }

    @Test(timeout=1800000)
    public void testRatioTooHigh() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.genetics.UniformCrossoverTest object = new org.apache.commons.math3.genetics.UniformCrossoverTest();
               object.testRatioTooHigh();
        }
    }

}