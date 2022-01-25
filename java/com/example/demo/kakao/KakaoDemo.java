package com.example.demo.kakao;
/**
 * packageName: com.example.demo.calc
 * fileName   : KakaoDemo.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : 카카오앱을 실행하는 컨트롤러
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-24   choigeonil    최초 생성
 */
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
