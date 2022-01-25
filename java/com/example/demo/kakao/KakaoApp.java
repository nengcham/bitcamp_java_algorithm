package com.example.demo.kakao;
/**
 * packageName: com.example.demo.calc
 * fileName   : KakaoApp.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : 전화번호와 메세지를 입력받아 출력하는 앱
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-24   choigeonil    최초 생성
 */
public class KakaoApp {
    static String KAKAO_APP = "카카오 앱";

    String telno;
    String message;

    public String kakao(String telno, String message){
        this.telno = telno;
        this.message = message;

        return String.format("전화번호: %s 메세지: %s", this.telno, this.message);
    }
}
