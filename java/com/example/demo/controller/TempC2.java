package com.example.demo.controller;

import com.example.demo.domain.GradeDTO;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : TempC2
 * author     : choigeonil
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-03   choigeonil    최초 생성
 */
public class TempC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생 수 입력");
        GradeDTO[] grades = new GradeDTO[scanner.nextInt()];
        for (int i = 0; i < grades.length; i++){
            grades[i] = new GradeDTO();
            System.out.println("이름, 국어, 영어, 수학점수 입력");
            grades[i].setName(scanner.next());
            grades[i].setKor(scanner.nextInt());
            grades[i].setEng(scanner.nextInt());
            grades[i].setMath(scanner.nextInt());
        }

        for (int i = 0; i < grades.length; i++){
            System.out.println(
                    String.format("이름:%s, 국어:%d, 영어:%d, 수학:%d ",
                            grades[i].getName(), grades[i].getKor(), grades[i].getEng(), grades[i].getMath()));
        }

    }
}
