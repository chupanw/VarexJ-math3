package cmu.defect4j.math3.analysis.solvers;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LaguerreSolverTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testQuinticFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.LaguerreSolverTest object = new org.apache.commons.math3.analysis.solvers.LaguerreSolverTest();
               object.testQuinticFunction();
        }
    }

    @Test(timeout=1800000)
    public void testQuinticFunction2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.LaguerreSolverTest object = new org.apache.commons.math3.analysis.solvers.LaguerreSolverTest();
               object.testQuinticFunction2();
        }
    }

    @Test(timeout=1800000)
    public void testParameters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.LaguerreSolverTest object = new org.apache.commons.math3.analysis.solvers.LaguerreSolverTest();
               object.testParameters();
        }
    }

    @Test(timeout=1800000)
    public void testLinearFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.LaguerreSolverTest object = new org.apache.commons.math3.analysis.solvers.LaguerreSolverTest();
               object.testLinearFunction();
        }
    }

    @Test(timeout=1800000)
    public void testQuadraticFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.LaguerreSolverTest object = new org.apache.commons.math3.analysis.solvers.LaguerreSolverTest();
               object.testQuadraticFunction();
        }
    }

}