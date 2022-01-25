package com.example.demo.hello;
/**
 * packageName: com.example.demo.calc
 * fileName   : HelloDemo.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : 헬로우 앱을 실행하는 컨트롤러
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-24   choigeonil    최초 생성
 */
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
