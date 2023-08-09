package com.rabbitmq.rmqtestapp;

import jakarta.jms.JMSException;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("[INFO] rabbitmq-server-9031 test application");
        org.apache.qpid.jms.JmsConnectionFactory jmsConnectionFactory = new org.apache.qpid.jms.JmsConnectionFactory("amqps://host:5671");
        jmsConnectionFactory.setUsername("BOB");
        jmsConnectionFactory.setPassword("PASSWORD");
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
