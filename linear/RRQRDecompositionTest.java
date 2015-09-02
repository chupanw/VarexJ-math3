package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class RRQRDecompositionTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testNonInvertible() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.SingularMatrixException", config)) {
               org.apache.commons.math3.linear.RRQRDecompositionTest object = new org.apache.commons.math3.linear.RRQRDecompositionTest();
               object.testNonInvertible();
        }
    }

    @Test(timeout=1800000)
    public void testQOrthogonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RRQRDecompositionTest object = new org.apache.commons.math3.linear.RRQRDecompositionTest();
               object.testQOrthogonal();
        }
    }

    @Test(timeout=1800000)
    public void testRUpperTriangular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RRQRDecompositionTest object = new org.apache.commons.math3.linear.RRQRDecompositionTest();
               object.testRUpperTriangular();
        }
    }

    @Test(timeout=1800000)
    public void testHTrapezoidal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RRQRDecompositionTest object = new org.apache.commons.math3.linear.RRQRDecompositionTest();
               object.testHTrapezoidal();
        }
    }

    @Test(timeout=1800000)
    public void testDimensions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RRQRDecompositionTest object = new org.apache.commons.math3.linear.RRQRDecompositionTest();
               object.testDimensions();
        }
    }

    @Test(timeout=1800000)
    public void testAPEqualQR() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RRQRDecompositionTest object = new org.apache.commons.math3.linear.RRQRDecompositionTest();
               object.testAPEqualQR();
        }
    }

    @Test(timeout=1800000)
    public void testRank() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RRQRDecompositionTest object = new org.apache.commons.math3.linear.RRQRDecompositionTest();
               object.testRank();
        }
    }

}