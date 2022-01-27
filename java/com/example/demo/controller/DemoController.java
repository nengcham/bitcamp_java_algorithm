package com.example.demo.controller;

import com.example.demo.bmi.BmiApp;
import com.example.demo.bmi.BmiDemo;
import com.example.demo.calc.CalDemo;
import com.example.demo.calc.CalcApp;
import com.example.demo.google.GoogleApp;
import com.example.demo.google.GoogleDemo;
import com.example.demo.grade.GradeApp;
import com.example.demo.grade.GradeDemo;
import com.example.demo.login.LoginApp;
import com.example.demo.login.LoginDemo;

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
 */
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiDemo bmiDemo = new BmiDemo();
        CalDemo calDemo = new CalDemo();
        GradeDemo gradeDemo = new GradeDemo();
        GoogleDemo googleDemo = new GoogleDemo();
        LoginDemo loginDemo = new LoginDemo();

        while(true){
            System.out.println("메뉴 선택");
            String menu = "1.BMI, 2.CALC, 3.GRADE, 4.GOOGLE, 5.LOGIN, 0.EXIT";
            System.out.println(menu);
            String select = scanner.next();
            String res = "";
            switch (select){
                case "0" :
                    System.out.println("EXIT"); return;
                case "1" : res = "BMI";
                    System.out.println(BmiApp.BMI_APP + "\n이름, 키(m), 몸무게(kg)");
                    res = bmiDemo.execute(scanner.next(), scanner.nextDouble(), scanner.nextDouble());
                    break;

                case "2" : res = "CALC";
                    System.out.println(CalcApp.CALC_APP + "\n숫자1, 연산자, 숫자2 입력");
                    res = calDemo.execute(scanner.nextInt(), scanner.next(), scanner.nextInt());
                    break;
                case "3" : res = "GRADE";
                    System.out.println(GradeApp.GRADE_TITLE + "\n번학생 이름, 국어, 영어, 수학");
                    res = gradeDemo.execute(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    break;
                case "4" : res = "GOOGLE";
                    System.out.println(GoogleApp.GOOGLE_APP + "\n검색할 키워드를 입력해 주세요.");
                    res = googleDemo.execute(scanner.next());
                    break;
                case "5" : res = "LOGIN";
                    System.out.println(LoginApp.LOGIN_APP + "\n아이디, 비밀번호, 이름");
                    res = loginDemo.execute(scanner.next(), scanner.next(), scanner.next());
                    break;
                default: res = "WRONG";
                    break;
            }
            System.out.println(res);
        }
    }
}
