package com.example.demo.login;
/**
 * packageName: com.example.demo.calc
 * fileName   : LoginDemo.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : 로그인 앱을 실행하는 컨트롤러
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-24   choigeonil    최초 생성
 */
import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();

        System.out.println(LoginApp.LOGIN_APP);

        System.out.println("아이디를 입력하세요");
        String id = scanner.next();

        System.out.println("비밀번호를 입력하세요");
        String pw = scanner.next();

        System.out.println("이름을 입력하세요");
        String name = scanner.next();

        String res = loginApp.login(id, pw, name);
        System.out.println(res);



    }
}
