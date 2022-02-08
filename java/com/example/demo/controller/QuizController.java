package com.example.demo.controller;

import com.example.demo.service.QuizService;
import com.example.demo.service.QuizServiceImpl;

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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuizService service = new QuizServiceImpl();
        String[] arr = {"김아름", "장원종", "유재혁", "강민", "최건일",
                "스택", "BruteForce", "해시", "DP", "BinarySearch",
                "큐", "DFS", "Sort", "Graph", "Greedy",
                "힙", "BFS"};
        while (true){
            System.out.println("MENU\n" +
                    "0.Exit\n" +
                    "1.팀별 과제 출력\n" +
                    "2.팀장 과제 출력\n" +
                    "3.큐 담당 출력\n" +
                    "4.팀원별 과제수 출력\n");
            switch (scanner.next()){
                case "0" :
                    System.out.println("EXIT"); return;
                case "1" :
                    service.quiz1(arr); break;
                case "2" :
                    service.quiz2(arr); break;
                case "3" :
                    service.quiz3(arr); break;
                case "4" :
                    service.quiz4(arr); break;
                default:
                    System.out.println("WRONG"); break;
            }
        }
    }
}