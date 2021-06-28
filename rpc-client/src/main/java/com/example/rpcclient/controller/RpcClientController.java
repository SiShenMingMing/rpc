package com.example.rpcclient.controller;

import com.example.rpcclient.dao.Student;
import com.example.rpcclient.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RpcClientController {
    @RequestMapping("/add")
    public Student add(String username, String age, String hobby, String key,String value) {
        System.out.println("username is:"+username);
        System.out.println("age is:"+age);
        System.out.println("hobby is:"+hobby);
        System.out.println("key is:"+key);
        System.out.println("key is:"+value);
        System.out.println("----------------------");
        Student student = new Student();
        student.setUsername(username);
        student.setHobby(hobby);
        student.setAge(age);
        student.setKey(key);
        student.setValue(value);
        TestService testService = new TestService();
        testService.Test(student);
        return student;
    }
    @Value("${server.port}")  // 从对应的配置中心找到文件并把属性注入到value值中
    private String value;
    @GetMapping("test")
    public String test(){
        return "这是一个正常的返回，端口是："+ value;
    }
}
