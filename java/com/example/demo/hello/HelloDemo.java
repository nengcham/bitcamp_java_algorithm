package com.example.demo.hello;

import java.util.Scanner;

public class HelloDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HelloApp helloApp = new HelloApp();

        System.out.println(HelloApp.HELLO_APP);

        System.out.println("이름을 입력해 주세요.");
        String name = scanner.next();

        System.out.println("나이를 입력해 주세요.");
        String age = scanner.next();

        String res = helloApp.hello(name, age);
        System.out.println(res);


    }
}
