package com.example.demo.kakao;

import java.util.Scanner;

public class KakaoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KakaoApp kakaoApp = new KakaoApp();

        System.out.println(KakaoApp.KAKAO_APP);

        System.out.println("전화번호를 입력해주세요");
        String telno = scanner.next();

        System.out.println("메세지를 입력해주세요");
        String message = scanner.next();

        String res = kakaoApp.kakao(telno, message);
        System.out.println(res);


    }
}
