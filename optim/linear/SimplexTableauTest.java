package cmu.defect4j.math3.optim.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SimplexTableauTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexTableauTest object = new org.apache.commons.math3.optim.linear.SimplexTableauTest();
               object.testSerial();
        }
    }

    @Test(timeout=1800000)
    public void testInitialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexTableauTest object = new org.apache.commons.math3.optim.linear.SimplexTableauTest();
               object.testInitialization();
        }
    }

    @Test(timeout=1800000)
    public void testDropPhase1Objective() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexTableauTest object = new org.apache.commons.math3.optim.linear.SimplexTableauTest();
               object.testDropPhase1Objective();
        }
    }

    @Test(timeout=1800000)
    public void testTableauWithNoArtificialVars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexTableauTest object = new org.apache.commons.math3.optim.linear.SimplexTableauTest();
               object.testTableauWithNoArtificialVars();
        }
    }

}