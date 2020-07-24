package com.example.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(8000)
                .addService(new GreetingServiceImpl())
                .build();

        server.start();

        System.out.println("Server Started");

        server.awaitTermination();
    }
}
