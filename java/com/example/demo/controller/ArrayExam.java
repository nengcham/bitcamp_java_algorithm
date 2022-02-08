package com.example.demo.controller;

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
public class ArrayExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q1. 팀별 과제를 출력하세요");
        String[] arr = {"김아름", "장원종", "유재혁", "강민", "최건일",
                "스택", "BruteForce", "해시", "DP", "BinarySearch",
                "큐", "DFS", "Sort", "Graph", "Greedy",
                "힙", "BFS"};

        String s = "";
        for (int i = 0; i < arr.length; i++){
            if (i%5 == 0) {
                s += "\n";
            }
            s += i+ ":" + arr[i] + "\t";
        }
        System.out.println(s);

        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요.");
        s = "";
        String l = "강민";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == l){
                for (int j = 0; j<3; j++){
                    s += arr[i+j*5] + ", " ;
                }
            }
        }
        System.out.println(s);

        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        s = "";
        l = "Greedy";
        for (int i = 5; i < arr.length; i++){
            if(arr[i].equals(l)){
                s += arr[i]+"를 담당한사람: " + arr[i%5];
            }
        }
        System.out.println(s);
    }
}