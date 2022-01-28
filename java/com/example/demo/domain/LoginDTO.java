package com.example.demo.domain;
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
public class LoginDTO {
    public static String LOGIN_TITLE = "로그인 앱";
    String id;
    String pw;
    String name;
    static String PASSWORD = "abc";

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getPw(){
        return pw;
    }
    public void setPw(String pw){
        this.pw = pw;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPASSWORD(){
        return PASSWORD;
    }
}
