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
public class TempC3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fiveNames = {   "김아름", "유재혁", "장원종",      "강 민",  "최건일"};
        String[] fiveSubjects = {"스택",   "해시",  "BruteForce", "DP",    "BinarySearch",
                                 "큐",     "Sort", "DFS",        "Graph", "Greedy",
                                 "힙",     "",     "BFS",        "",      ""};

        for (int i = 0; i < fiveNames.length; i ++){
            System.out.println(fiveNames[(i+5) % 5] + " : " + fiveSubjects[i] + ", " + fiveSubjects[i+5] + ", " + fiveSubjects[i+10]);

        }

    }
}
// "스택", "큐", "힙", "해시", "Sort", "Brute Force", "DFS" , "BFS", "DP", "Graph", "Binary Search", "Greedy"