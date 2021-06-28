package com.example.rpcclient.service;

import com.example.grpc.HelloRequest;
import com.example.grpc.HelloResponse;
import com.example.grpc.HelloServiceGrpc;
import com.example.rpcclient.dao.Student;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class TestService {

    public void Test(Student student){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8082)
                .usePlaintext()
                .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub =
                HelloServiceGrpc.newBlockingStub(channel);

        HelloResponse helloResponse = stub.hello(
                HelloRequest.newBuilder()
                        .setName(student.getUsername())
                        .setAge(Integer.parseInt(student.getAge()))
                        .addHobbies(student.getHobby()).putTags( student.getKey(),student.getValue() )
                        .build());

        System.out.println(helloResponse);


        //channel.shutdown();
    }
}
