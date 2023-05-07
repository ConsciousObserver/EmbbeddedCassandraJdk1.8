package com.example;

import java.io.IOException;

import org.apache.cassandra.exceptions.ConfigurationException;
import org.apache.thrift.transport.TTransportException;
import org.cassandraunit.utils.EmbeddedCassandraServerHelper;

public class EmbeddedCassandraMain {
    public static void main(String[] args)
            throws ConfigurationException, IOException, TTransportException {
        System.out.println("Started");

        EmbeddedCassandraServerHelper.startEmbeddedCassandra(60000);
    }
}
