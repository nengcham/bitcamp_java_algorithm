package com.example.demo.bmi;

import java.util.Scanner;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiDemo.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : BMI 앱을 실행하는 컨트롤러
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25   choigeonil    최초 생성
 */
public class BmiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiApp bmiApp = new BmiApp();

        System.out.println(BmiApp.BMI_APP);

        System.out.println("이름을 입력하세요");
        String name = scanner.next();

        System.out.println("키(m)를 입력하세요");
        double height = scanner.nextDouble();

        System.out.println("몸무게(kg)를 입력하세요");
        double weight = scanner.nextDouble();

        String res = bmiApp.bmi(name, height, weight);
        System.out.println(res);




    }
}
