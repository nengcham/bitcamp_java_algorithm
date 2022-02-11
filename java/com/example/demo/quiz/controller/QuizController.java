package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.*;

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
        Feb06Service fev06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();
        Feb10Service feb10Service = new Feb10ServiceImpl();

        while (true){
            System.out.println("[서브메뉴]\n0)Exit 1)2월6일 2)2월7일 3)2월8일 4)2월10일");
            switch (scanner.next()){
                case "0":
                    System.out.println("EXIT"); return;
                case "1":
                    System.out.println("2월 6일");
                    String[] arr = {"김아름", "장원종", "유재혁", "강민", "최건일",
                            "스택", "BruteForce", "해시", "DP", "BinarySearch",
                            "큐", "DFS", "Sort", "Graph", "Greedy",
                            "힙", "BFS"};
                    while (true){
                        System.out.println("[소메뉴]\n" +
                                "0.Exit\n" +
                                "1.팀별 과제 출력\n" +
                                "2.팀장 과제 출력\n" +
                                "3.큐 담당 출력\n" +
                                "4.팀원별 과제수 출력\n");
                        switch (scanner.next()){
                            case "0" :
                                System.out.println("EXIT"); return;
                            case "1" :
                                fev06Service.quiz1(arr); break;
                            case "2" :
                                fev06Service.quiz2(arr); break;
                            case "3" :
                                fev06Service.quiz3(arr); break;
                            case "4" :
                                fev06Service.quiz4(arr); break;
                            default:
                                System.out.println("WRONG"); break;
                        }
                    }

                case "2":
                    System.out.println("2월 7일");
                    while (true){
                        System.out.println("[소메뉴]\n" +
                                "0. 종료\n" +
                                "1. 주사위(dice)\n" +
                                "2. 가위바위보(rps)\n" +
                                "3. 입력받은 두 수 사이에 있는 소수 구하기(getPrime)\n" +
                                "4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기(leapYear)\n" +
                                "5. 임의로 입력받은 숫자 맞추기(numberGolf)\n");
                        switch (scanner.next()){
                            case "0":
                                System.out.println("EXIT"); return;
                            case "1":
                                feb07Service.dice(scanner); break;
                            case "2":
                                feb07Service.rps(scanner); break;
                            case "3":
                                feb07Service.getPrime(scanner); break;
                            case "4":
                                feb07Service.leapYear(scanner); break;
                            case "5":
                                feb07Service.numberGolf(scanner); break;
                            default:
                                System.out.println("WRONG"); break;
                        }
                    }
                case "3":
                    System.out.println("2월 8일");
                    while (true){
                        System.out.println("[소메뉴]\n" +
                                "0. 종료\n" +
                                "1. 로또\n" +
                                "2. 야구\n" +
                                "3. 좌석예약\n" +
                                "4. 은행 입출금\n" +
                                "5. 구구단\n");
                        switch (scanner.next()){
                            case "0":
                                System.out.println("EXIT"); return;
                            case "1":
                                feb08Service.lotto(scanner); break;
                            case "2":
                                feb08Service.baseball(scanner); break;
                            case "3":
                                feb08Service.booking(scanner); break;
                            case "4":
                                feb08Service.bank(scanner); break;
                            case "5":
                                feb08Service.gugudan(scanner); break;
                            default:
                                System.out.println("WRONG");

                        }
                    }
                case "4":
                    System.out.println("2월 10일");
                    while (true){
                        System.out.println("[소메뉴]\n" +
                                "0. 종료\n" +
                                "[김아름]1.bubbleSort 2.insertionSort 3.selectionSort\n" +
                                "[강민]4.quickSort 5.mergeSort\n" +
                                "[유재혁]6.magicSquare\n" +
                                "[최건일]7.zigzag\n" +
                                "[장원종]8.rectangleStarPrint 9.triangleStarPrint");
                        switch (scanner.next()){
                            case "0":
                                System.out.println("EXIT"); return;
                            case "1":
                                feb10Service.bubbleSort(); break;
                            case "2":
                                feb10Service.insertionSort(); break;
                            case "3":
                                feb10Service.selectionSort(); break;
                            case "4":
                                feb10Service.quickSort(); break;
                            case "5":
                                feb10Service.mergeSort(); break;
                            case "6":
                                feb10Service.magicSquare(); break;
                            case "7":
                                feb10Service.zigzag(); break;
                            case "8":
                                feb10Service.rectangleStarPrint(); break;
                            case "9":
                                feb10Service.triangleStarPrint(); break;
                            default:
                                System.out.println("WRONG");
                        }
                    }
                case "5":
                case "6":
                case "7":
                default:
                    System.out.println("WRONG");
                    break;
            }
        }
    }
}