package cmu.defect4j.math3.random;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CorrelatedRandomVectorGeneratorTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testMath226() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.CorrelatedRandomVectorGeneratorTest object = new org.apache.commons.math3.random.CorrelatedRandomVectorGeneratorTest();
               object.testMath226();
        }
    }

    @Test(timeout=1800000)
    public void testRootMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.CorrelatedRandomVectorGeneratorTest object = new org.apache.commons.math3.random.CorrelatedRandomVectorGeneratorTest();
               object.testRootMatrix();
        }
    }

    @Test(timeout=1800000)
    public void testMeanAndCovariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.CorrelatedRandomVectorGeneratorTest object = new org.apache.commons.math3.random.CorrelatedRandomVectorGeneratorTest();
               object.testMeanAndCovariance();
        }
    }

    @Test(timeout=1800000)
    public void testSampleWithZeroCovariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.CorrelatedRandomVectorGeneratorTest object = new org.apache.commons.math3.random.CorrelatedRandomVectorGeneratorTest();
               object.testSampleWithZeroCovariance();
        }
    }

    @Test(timeout=1800000)
    public void testRank() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.CorrelatedRandomVectorGeneratorTest object = new org.apache.commons.math3.random.CorrelatedRandomVectorGeneratorTest();
               object.testRank();
        }
    }

}