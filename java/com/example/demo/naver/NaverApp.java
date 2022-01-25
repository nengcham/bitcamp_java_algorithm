package com.example.demo.naver;

/**
 * packageName: com.example.demo.naver
 * fileName   : NaverApp.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : 아이디, 비밀번호를 입력받아 로그인 결과를 출력하는 앱
 * variable   : [클래스변수] NAVER_LOGO, [인스턴스변수] id, pw
 *              [로컬변수] res, [파라미터] id
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25   choigeonil    최초 생성
 */
public class NaverApp {
    public static String NAVER_LOGO = "NAVER";
    private String id;
    private String pw;

    public String naver(String id){
        this.id = id;
        String res = "ID: %s 로그인 성공";

        return String.format(res, this.id);
    }

}
