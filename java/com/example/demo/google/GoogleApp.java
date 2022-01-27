package com.example.demo.google;

/**
 * packageName: com.example.demo.google
 * fileName   : GoogleApp.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : 검색 또는 URL을 입력받아 결과값을 출력하는 앱
 * variable   : [클래스변수] GOOGLE_APP, [인스턴스변수] search
 *              [로컬변수] res, [파라미터] search
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25   choigeonil    최초 생성
 */
public class GoogleApp {
    public static String GOOGLE_APP = "Google";
    private String search;

    public String getgoogle(String search){
        this.search = search;
        String res = "%s을(를) 검색한 결과입니다.";
        return String.format(res, this.search);
    }

}








