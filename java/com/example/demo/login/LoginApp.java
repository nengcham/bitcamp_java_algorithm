package com.example.demo.login;
/**
 * packageName: com.example.demo.calc
 * fileName   : LoginApp.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : 아이디, 패스워드, 이름을 입력받아 로그인 결과를 출력하는 앱
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-24   choigeonil    최초 생성
 * 2022-01-26   choigeonil    if절 작성, 성공실패 결과추가
 */
public class LoginApp {
    static String LOGIN_APP = "로그인 앱";
    String id;
    String pw;
    String name;
    static String PASSWORD = "abc";

    public String login(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;

        String res = "";
//        if (pw.equals(PASSWORD)){
//            res = String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공", this.name, this.pw);
//        } else {
//            res = String.format("%s 님의 ID는 맞고, 비번 %s가 틀립니다. 로그인 실패", this.id, this.pw);
//        }
        switch (pw){
            case "abc": res = String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공", this.name, this.pw); break;
            default: res = String.format("%s 님의 ID는 맞고, 비번 %s가 틀립니다. 로그인 실패", this.id, this.pw);
        }
        return res;
    }

}
