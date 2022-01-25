package com.example.demo.login;
/**
 * packageName: com.example.demo.calc
 * fileName   : LoginApp.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : 아이디, 패스워드, 이름을 입력받아 출력하는 앱
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-24   choigeonil    최초 생성
 */
public class LoginApp {
    static String LOGIN_APP = "로그인 앱";
    String id;
    String pw;
    String name;

    public String login(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;

        return String.format("ID: %s, PW: %s, Name: %s", this.id, this.pw, this.name);
    }

}
