package cmu.defect4j.math3.optim.nonlinear.scalar;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MultiStartMultivariateOptimizerTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testCircleFitting() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizerTest();
               object.testCircleFitting();
        }
    }

    @Test(timeout=1800000)
    public void testRosenbrock() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizerTest();
               object.testRosenbrock();
        }
    }

}