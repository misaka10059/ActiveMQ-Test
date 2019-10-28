package com.mn.activemq_test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        TestMQ testMQ = new TestMQ();
       // testMQ.testMQProducerQueue();
        testMQ.TestMQConsumerQueue();
    }
}
