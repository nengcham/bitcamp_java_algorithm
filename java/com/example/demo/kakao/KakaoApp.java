package com.example.demo.kakao;

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
