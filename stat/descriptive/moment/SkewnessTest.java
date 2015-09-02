package cmu.defect4j.math3.stat.descriptive.moment;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SkewnessTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SkewnessTest object = new org.apache.commons.math3.stat.descriptive.moment.SkewnessTest();
               object.testNaN();
        }
    }

    @Test(timeout=1800000)
    public void testIncrementation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SkewnessTest object = new org.apache.commons.math3.stat.descriptive.moment.SkewnessTest();
               object.testIncrementation();
        }
    }

    @Test(timeout=1800000)
    public void testMomentSmallSamples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SkewnessTest object = new org.apache.commons.math3.stat.descriptive.moment.SkewnessTest();
               object.testMomentSmallSamples();
        }
    }

    @Test(timeout=1800000)
    public void testCopyConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SkewnessTest object = new org.apache.commons.math3.stat.descriptive.moment.SkewnessTest();
               object.testCopyConsistency();
        }
    }

    @Test(timeout=1800000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SkewnessTest object = new org.apache.commons.math3.stat.descriptive.moment.SkewnessTest();
               object.testSerialization();
        }
    }

    @Test(timeout=1800000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SkewnessTest object = new org.apache.commons.math3.stat.descriptive.moment.SkewnessTest();
               object.testSerial();
        }
    }

    @Test(timeout=1800000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SkewnessTest object = new org.apache.commons.math3.stat.descriptive.moment.SkewnessTest();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=1800000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SkewnessTest object = new org.apache.commons.math3.stat.descriptive.moment.SkewnessTest();
               object.testConsistency();
        }
    }

    @Test(timeout=1800000)
    public void testEvaluation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SkewnessTest object = new org.apache.commons.math3.stat.descriptive.moment.SkewnessTest();
               object.testEvaluation();
        }
    }

    @Test(timeout=1800000)
    public void testEvaluateArraySegment() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SkewnessTest object = new org.apache.commons.math3.stat.descriptive.moment.SkewnessTest();
               object.testEvaluateArraySegment();
        }
    }

    @Test(timeout=1800000)
    public void testEvaluateArraySegmentWeighted() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SkewnessTest object = new org.apache.commons.math3.stat.descriptive.moment.SkewnessTest();
               object.testEvaluateArraySegmentWeighted();
        }
    }

    @Test(timeout=1800000)
    public void testWeightedConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SkewnessTest object = new org.apache.commons.math3.stat.descriptive.moment.SkewnessTest();
               object.testWeightedConsistency();
        }
    }

    @Test(timeout=1800000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SkewnessTest object = new org.apache.commons.math3.stat.descriptive.moment.SkewnessTest();
               object.testCopy();
        }
    }

}