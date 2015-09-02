package cmu.defect4j.math3.exception.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ExceptionContextTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testMessageChain() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.exception.util.ExceptionContextTest object = new org.apache.commons.math3.exception.util.ExceptionContextTest();
               object.testMessageChain();
        }
    }

    @Test(timeout=1800000)
    public void testNoArgAddMessage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.exception.util.ExceptionContextTest object = new org.apache.commons.math3.exception.util.ExceptionContextTest();
               object.testNoArgAddMessage();
        }
    }

    @Test(timeout=1800000)
    public void testContext() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.exception.util.ExceptionContextTest object = new org.apache.commons.math3.exception.util.ExceptionContextTest();
               object.testContext();
        }
    }

    @Test(timeout=1800000)
    public void testSerialize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.exception.util.ExceptionContextTest object = new org.apache.commons.math3.exception.util.ExceptionContextTest();
               object.testSerialize();
        }
    }

    @Test(timeout=1800000)
    public void testSerializeUnserializable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.exception.util.ExceptionContextTest object = new org.apache.commons.math3.exception.util.ExceptionContextTest();
               object.testSerializeUnserializable();
        }
    }

}