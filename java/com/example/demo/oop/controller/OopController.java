package com.example.demo.oop.controller;

import com.example.demo.oop.domain.CelPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;
import com.example.demo.oop.service.PhoneService;
import com.example.demo.oop.service.PhoneServiceImpl;

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
public class OopController {
    public void excute(Scanner scanner) {

        while (true){
            System.out.println("[서브메뉴]\n0.종료\n" +
                    "1.은닉화(Encapsulation)\n" +
                    "2.상속(Inheritance)\n" +
                    "3.추상화(Abstraction)\n" +
                    "4.다형성(Polymorphism)");
            switch (scanner.next()){
                case "0":
                    System.out.println("EXIT"); return;
                case "1":
                    System.out.println("POJO가 은닉화다"); break;
                case "2":
                    System.out.println("extecd가 상속이다.");
                    Phone phone = new Phone("금성전화기", "금성전자");
                    CelPhone celPhone = new CelPhone("블랙베리", "핸드폰","이동");
                    IPhone iPhone = new IPhone("애플");
                    GalPhone galPhone = new GalPhone("삼성");
                    PhoneService phoneService = new PhoneServiceImpl();
                    while (true){
                        System.out.println("[소메뉴]\n0.종료\n" +
                                "1.집전화\n" +
                                "2.핸드폰\n" +
                                "3.아이폰\n" +
                                "4.갤럭시폰");
                        switch (scanner.next()){
                            case "0":
                                System.out.println("EXIT"); return;
                            case "1":
                                System.out.println("### 집전화 ###");
                                phone.setCall("여보세요?");
                                phoneService.usePhone(phone);
                                break;
                            case "2":
                                System.out.println("### 핸드폰 ###");
                                celPhone.setCall("안녕하세요");
                                phoneService.useCelPhone(celPhone);
                                break;
                            case "3":
                                System.out.println("### 아이폰 ###");
                                iPhone.setSearch("뉴스");
                                phoneService.useIPhone(iPhone);
                                break;
                            case "4":
                                System.out.println("### 갤럭시폰 ###");
                                galPhone.setPay("삼성페이");
                                phoneService.useGalPhone(galPhone);
                                break;
                            default:
                                System.out.println("WRONG"); break;
                        }
                    }
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("WRONG"); break;
            }
        }
    }
}
