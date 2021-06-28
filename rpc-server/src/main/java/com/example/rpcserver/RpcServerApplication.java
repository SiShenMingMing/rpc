package com.example.rpcserver;

import com.example.rpcserver.service.HelloService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class RpcServerApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort( 8082 )
                .addService( new HelloService() )
                .build();

        System.out.println( "Starting server..." );
        server.start();
        System.out.println( "Server started!" );
        server.awaitTermination();
        SpringApplication.run(RpcServerApplication.class, args);
    }

}
