package com.rabbitmq.rmqtestapp;

import jakarta.jms.JMSException;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("[INFO] rabbitmq-server-9031 test application");
        org.apache.qpid.jms.JmsConnectionFactory jmsConnectionFactory = new org.apache.qpid.jms.JmsConnectionFactory("amqp://localhost:5672");
        jmsConnectionFactory.setUsername("admin");
        jmsConnectionFactory.setPassword("foobar");
        try
        {
            jmsConnectionFactory.createConnection().createSession();
        }
        catch (JMSException ex)
        {
            System.err.println("[ERROR] createSession() failed:");
            ex.printStackTrace();
            System.err.println(ex);
        }
    }
}
