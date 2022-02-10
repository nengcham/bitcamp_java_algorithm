package com.example.demo.auth.controller;

import com.example.demo.auth.domain.BmiDTO;
import com.example.demo.auth.domain.CalcDTO;
import com.example.demo.auth.domain.GoogleDTO;
import com.example.demo.auth.domain.GradeDTO;
import com.example.demo.auth.domain.UserDTO;
import com.example.demo.auth.service.MemberService;
import com.example.demo.auth.service.MemberServiceImpl;

import java.util.Scanner;
/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController
 * author     : choigeonil
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-27   choigeonil    최초 생성
 * 2022-01-28                 DTO, Service, Controller 구분
 */
public class AuthController {
    public void excute(Scanner scanner) {
        MemberService service = new MemberServiceImpl();

        while(true){
            System.out.println("메뉴 선택\n" + "1.BMI 2.CALC 3.GRADE 4.GOOGLE 5.LOGIN 0.EXIT");
            String res = "";
            switch (scanner.next()){
                case "0" :
                    System.out.println("EXIT"); return;
                case "1" :
                    System.out.println(BmiDTO.BMI_TITLE + "\n이름, 키(cm), 몸무게(kg)");
                    BmiDTO b = BmiDTO.getInstance();
                    b.setName(scanner.next());
                    b.setHeight(scanner.nextDouble());
                    b.setWeight(scanner.nextDouble());
                    res = service.getBmi(b);
                    break;
                case "2" :
                    System.out.println(CalcDTO.CALC_TITLE + "\n숫자1, 연산자, 숫자2 입력");
                    CalcDTO c = CalcDTO.getInstance();
                    c.setNum1(scanner.nextInt());
                    c.setOpcode(scanner.next());
                    c.setNum2(scanner.nextInt());
                    res = service.calc(c);
                    break;
                case "3" :
                    System.out.println(GradeDTO.GRADE_TITLE + "\n이름, 국어, 영어, 수학");
                    GradeDTO gra = GradeDTO.getInstance();
                    gra.setName(scanner.next());
                    gra.setKor(scanner.nextInt());
                    gra.setEng(scanner.nextInt());
                    gra.setMath(scanner.nextInt());
                    res = service.getGrade(gra);
                    break;
                case "4" :
                    System.out.println(GoogleDTO.GOOGLE_TITLE + "\n검색할 키워드를 입력해 주세요.");
                    GoogleDTO goo = GoogleDTO.getInstance();
                    goo.setSearch(scanner.next());
                    res = service.search(goo);
                    break;
                case "5" :
                    System.out.println(UserDTO.LOGIN_TITLE + "\n아이디, 비밀번호, 이름");
                    UserDTO u = UserDTO.getInstance();
                    u.setId(scanner.next());
                    u.setPw(scanner.next());
                    u.setName(scanner.next());
                    res = service.login(u);
                    break;
                default: res = "WRONG";
                    break;
            }
            System.out.println(res);
        }
    }
}
