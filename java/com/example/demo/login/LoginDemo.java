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
public class LoginDemo {
    public String execute(String id, String pw, String name) {
        LoginApp loginApp = new LoginApp();
        return loginApp.getlogin(id, pw, name);
    }
}
