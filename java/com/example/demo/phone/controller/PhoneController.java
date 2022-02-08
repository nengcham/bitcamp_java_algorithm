package com.example.demo.phone.controller;

import com.example.demo.phone.service.PhoneService;
import com.example.demo.phone.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : PhoneController
 * author     : choigeonil
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08   choigeonil    최초 생성
 */
public class PhoneController {
    public void excute(Scanner scanner) {

        PhoneService service = new PhoneServiceImpl();
        String s = "";
        while (true){
            System.out.println("[MENU]\n0.종료 1.집전화 2.휴대폰 3.아이폰 4.갤럭시노트 ");
            switch (scanner.next()){
                case "0":
                    System.out.println("프로그램 종료");return;
                case "1":
                    s = "집전화";
                    service.usePhone(scanner);break;
                case "2":
                    s = "휴대폰";
                    service.useCelPhone(scanner);break;
                case "3":
                    s = "아이폰";
                    service.useIPhone(scanner);break;
                case "4":
                    s = "갤럭시노트";
                    service.useGalPhone(scanner);break;
                default:
                    s = "잘못 입력하셨습니다."; break;
            }
            System.out.println(s);
        }
    }
}
