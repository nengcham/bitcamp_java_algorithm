package com.example.demo.hello;

public class HelloApp {
    static String HELLO_APP = "헬로우 앱";
    String name;
    String age;

    public String hello(String name, String age){
        this.name = name;
        this.age = age;

        return String.format("안녕! 내 이름은 %s, 나이는 %살 이야.", this.name, this.age);

    }
}
