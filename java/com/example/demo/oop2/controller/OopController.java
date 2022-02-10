package com.example.demo.oop2.controller;

import com.example.demo.oop2.domain.CelPhone;
import com.example.demo.oop2.domain.GalPhone;
import com.example.demo.oop2.domain.IPhone;
import com.example.demo.oop2.domain.Phone;
import com.example.demo.oop2.service.PhoneService;
import com.example.demo.oop2.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.oop2.controller
 * fileName   : OopController
 * author     : choigeonil
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-09   choigeonil    최초 생성
 */
public class OopController {
    public static void excute(Scanner scanner) {
        Phone phone = new Phone("금성", "금성전화기");
        CelPhone celPhone = new CelPhone("블랙베리", "핸드폰", "이동");
        IPhone iPhone = new IPhone("애플", "아이폰", "이동");
        GalPhone galPhone = new GalPhone("삼성", "갤럭시");
        PhoneService phoneService = new PhoneServiceImpl();

        while (true){
            System.out.println("[MENU]\n" +
                    "0.EXIT\n" +
                    "1.집전화\n" +
                    "2.핸드폰\n" +
                    "3.아이폰\n" +
                    "4.갤럭시폰");
            switch (scanner.next()){
                case "0":
                    System.out.println("EXIT"); return;
                case "1":
                    phone.setCall("여보세요?");
                    phoneService.usePhone(phone);
                    break;
                case "2":
                    celPhone.setCall("안녕하세요");
                    phoneService.useCelPhone(celPhone);
                    break;
                case "3":
                    iPhone.setSearch("뉴스");
                    phoneService.useIPhone(iPhone);
                    break;
                case "4":
                    galPhone.setPay("삼성페이");
                    phoneService.useGalPhone(galPhone);
                    break;
                default:
                    System.out.println("WRONG"); break;
            }
        }
    }
}
