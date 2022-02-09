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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone phone = new Phone();
        CelPhone celPhone = new CelPhone();
        IPhone iPhone = new IPhone();
        GalPhone galPhone = new GalPhone();
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
                    phone.setCompany("금성");
                    phone.setKind("금성전화");
                    phone.setCall("여보세요?");
                    phoneService.usePhone(phone);
                    break;
                case "2":
                    celPhone.setCompany("블랙베리");
                    celPhone.setKind("핸드폰");
                    celPhone.setCall("안녕하세요");
                    celPhone.setMove("이동");
                    phoneService.useCelPhone(celPhone);
                    break;
                case "3":
                    iPhone.setCompany("애플");
                    iPhone.setKind("아이폰");
                    iPhone.setMove("이동");
                    iPhone.setSearch("뉴스");
                    phoneService.useIPhone(iPhone);
                    break;
                case "4":
                    galPhone.setCompany("삼성");
                    galPhone.setKind("갤럭시");
                    galPhone.setPay("삼성페이");
                    phoneService.useGalPhone(galPhone);
                    break;
                default:
                    System.out.println("WRONG"); break;
            }
        }
    }
}
