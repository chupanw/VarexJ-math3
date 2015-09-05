package cmu.defect4j.math3.analysis.interpolation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class NevilleInterpolatorTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testSinFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.NevilleInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.NevilleInterpolatorTest();
               object.testSinFunction();
        }
    }

    @Test(timeout=1800000)
    public void testParameters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.NevilleInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.NevilleInterpolatorTest();
               object.testParameters();
        }
    }

    @Test(timeout=1800000)
    public void testExpm1Function() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.NevilleInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.NevilleInterpolatorTest();
               object.testExpm1Function();
        }
    }

}