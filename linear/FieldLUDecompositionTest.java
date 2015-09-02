package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FieldLUDecompositionTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testNonSquare() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldLUDecompositionTest object = new org.apache.commons.math3.linear.FieldLUDecompositionTest();
               object.testNonSquare();
        }
    }

    @Test(timeout=1800000)
    public void testLLowerTriangular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldLUDecompositionTest object = new org.apache.commons.math3.linear.FieldLUDecompositionTest();
               object.testLLowerTriangular();
        }
    }

    @Test(timeout=1800000)
    public void testUUpperTriangular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldLUDecompositionTest object = new org.apache.commons.math3.linear.FieldLUDecompositionTest();
               object.testUUpperTriangular();
        }
    }

    @Test(timeout=1800000)
    public void testPPermutation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldLUDecompositionTest object = new org.apache.commons.math3.linear.FieldLUDecompositionTest();
               object.testPPermutation();
        }
    }

    @Test(timeout=1800000)
    public void testPAEqualLU() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldLUDecompositionTest object = new org.apache.commons.math3.linear.FieldLUDecompositionTest();
               object.testPAEqualLU();
        }
    }

    @Test(timeout=1800000)
    public void testSingular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldLUDecompositionTest object = new org.apache.commons.math3.linear.FieldLUDecompositionTest();
               object.testSingular();
        }
    }

    @Test(timeout=1800000)
    public void testMatricesValues1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldLUDecompositionTest object = new org.apache.commons.math3.linear.FieldLUDecompositionTest();
               object.testMatricesValues1();
        }
    }

    @Test(timeout=1800000)
    public void testMatricesValues2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldLUDecompositionTest object = new org.apache.commons.math3.linear.FieldLUDecompositionTest();
               object.testMatricesValues2();
        }
    }

    @Test(timeout=1800000)
    public void testDimensions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldLUDecompositionTest object = new org.apache.commons.math3.linear.FieldLUDecompositionTest();
               object.testDimensions();
        }
    }

}