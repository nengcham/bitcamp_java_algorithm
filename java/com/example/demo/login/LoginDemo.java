package com.example.demo.login;

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
