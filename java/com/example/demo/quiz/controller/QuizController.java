package com.example.demo.quiz.controller;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : TempC3
 * author     : choigeonil
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-03   choigeonil    최초 생성
 */
public class QuizController {
    public void excute(Scanner scanner){
        Feb06Controller feb06Controller = new Feb06Controller();
        Feb07Controller feb07Controller = new Feb07Controller();
        Feb08Controller feb08Controller = new Feb08Controller();

        while (true){
            System.out.println("0)Exit 1)2월6일 2)2월7일 3)2월8일");
            switch (scanner.next()){
                case "0":
                    System.out.println("EXIT"); return;
                case "1":
                    System.out.println("2월 6일");
                    feb06Controller.excute(scanner); break;
                case "2":
                    System.out.println("2월 7일");
                    feb07Controller.excute(scanner); break;
                case "3":
                    System.out.println("2월 8일"); break;
                default:
                    System.out.println("다시입력"); break;
            }
        }
    }

}