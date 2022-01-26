package com.example.demo.grade;

import java.util.Scanner;

/**
 * packageName: com.example.demo.grade
 * fileName   : GradeDeom
 * author     : choigeonil
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-26   choigeonil    최초 생성
 */
public class GradeDeom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();

        System.out.println("이름을 입력해 주세요");
        String name = scanner.next();

        System.out.println("국어점수를 입력해 주세요");
        int kor = scanner.nextInt();

        System.out.println("영어점수를 입력해 주세요");
        int eng = scanner.nextInt();

        System.out.println("수학점수를 입력해 주세요");
        int math = scanner.nextInt();

        String res = gradeApp.getGrade(name, kor, eng, math);
        System.out.println(res);
    }
}
