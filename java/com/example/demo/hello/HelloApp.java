package com.example.demo.hello;
/**
 * packageName: com.example.demo.calc
 * fileName   : HelloApp.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : 이름과 나이를 입력받아 자기소개를 출력하는 앱
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-24   choigeonil    최초 생성
 */
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
