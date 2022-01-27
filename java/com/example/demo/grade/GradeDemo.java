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
public class GradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();

        for(int i = 1; i<3; i++){
            System.out.println(i+"번학생 이름, 국어, 영어, 수학");
            String name = scanner.next();
            int kor = scanner.nextInt();
            int eng = scanner.nextInt();
            int math = scanner.nextInt();
            String res = gradeApp.getGrade(name, kor, eng, math);
            System.out.println(res);
        }

    }
}