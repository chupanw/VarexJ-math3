package cmu.defect4j.math3.stat.clustering;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class EuclideanIntegerPointTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testArrayIsReference() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.clustering.EuclideanIntegerPointTest object = new org.apache.commons.math3.stat.clustering.EuclideanIntegerPointTest();
               object.testArrayIsReference();
        }
    }

    @Test(timeout=1800000)
    public void testCentroid() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.clustering.EuclideanIntegerPointTest object = new org.apache.commons.math3.stat.clustering.EuclideanIntegerPointTest();
               object.testCentroid();
        }
    }

    @Test(timeout=1800000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.clustering.EuclideanIntegerPointTest object = new org.apache.commons.math3.stat.clustering.EuclideanIntegerPointTest();
               object.testSerial();
        }
    }

    @Test(timeout=1800000)
    public void testDistance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.clustering.EuclideanIntegerPointTest object = new org.apache.commons.math3.stat.clustering.EuclideanIntegerPointTest();
               object.testDistance();
        }
    }

}