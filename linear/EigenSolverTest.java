package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class EigenSolverTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testSolve() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenSolverTest object = new org.apache.commons.math3.linear.EigenSolverTest();
               object.testSolve();
        }
    }

    @Test(timeout=1800000)
    public void testSolveDimensionErrors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenSolverTest object = new org.apache.commons.math3.linear.EigenSolverTest();
               object.testSolveDimensionErrors();
        }
    }

    @Test(timeout=1800000)
    public void testNonInvertible() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenSolverTest object = new org.apache.commons.math3.linear.EigenSolverTest();
               object.testNonInvertible();
        }
    }

    @Test(timeout=1800000)
    public void testInvertible() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenSolverTest object = new org.apache.commons.math3.linear.EigenSolverTest();
               object.testInvertible();
        }
    }

}