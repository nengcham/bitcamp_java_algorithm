package com.example.demo.auth.controller;

import com.example.demo.auth.domain.BmiDTO;
import com.example.demo.auth.domain.CalcDTO;
import com.example.demo.auth.domain.GoogleDTO;
import com.example.demo.auth.domain.GradeDTO;
import com.example.demo.auth.domain.LoginDTO;
import com.example.demo.auth.service.StudentService;
import com.example.demo.auth.service.StudentServiceImpl;

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
        BmiDTO bmi = new BmiDTO();
        CalcDTO calc = new CalcDTO();
        GradeDTO grade = new GradeDTO();
        GoogleDTO google = new GoogleDTO();
        LoginDTO login = new LoginDTO();
        StudentService service = new StudentServiceImpl();

        while(true){
            System.out.println("메뉴 선택\n" + "1.BMI 2.CALC 3.GRADE 4.GOOGLE 5.LOGIN 0.EXIT");
            String res = "";
            switch (scanner.next()){
                case "0" :
                    System.out.println("EXIT"); return;
                case "1" :
                    System.out.println(BmiDTO.BMI_TITLE + "\n이름, 키(cm), 몸무게(kg)");
                    bmi.setName(scanner.next());
                    bmi.setHeight(scanner.nextDouble());
                    bmi.setWeight(scanner.nextDouble());
                    res = service.getBmi(bmi);
                    break;
                case "2" :
                    System.out.println(CalcDTO.CALC_TITLE + "\n숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = service.calc(calc);
                    break;
                case "3" :
                    System.out.println(GradeDTO.GRADE_TITLE + "\n이름, 국어, 영어, 수학");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = service.getGrade(grade);
                    break;
                case "4" :
                    System.out.println(GoogleDTO.GOOGLE_TITLE + "\n검색할 키워드를 입력해 주세요.");
                    google.setSearch(scanner.next());
                    res = service.search(google);
                    break;
                case "5" :
                    System.out.println(LoginDTO.LOGIN_TITLE + "\n아이디, 비밀번호, 이름");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    res = service.login(login);
                    break;
                default: res = "WRONG";
                    break;
            }
            System.out.println(res);
        }
    }
}
