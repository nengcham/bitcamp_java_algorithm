package com.example.demo.quiz.controller;

import com.example.demo.algorithm.service.QueueServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.controller
 * fileName   : QuizTest
 * author     : choigeonil
 * date       : 2022-02-10
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-10   choigeonil    최초 생성
 */
public class QuizTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rannum = (int)(Math.random()*9+1);
        System.out.println("### 지그재그 ###\n" +
                "1 ~ 10 사이의 무작위 정수 "+ rannum +" 지그재그를 출력합니다.");

        int[][] arr =new int[rannum][rannum];
        int res = 1;
        for(int i = 0; i < rannum; i++){
            for(int j = 0; j < rannum; j++){
                arr[i][j] = res;
                res++;

            }
            System.out.println(res);
        }
    }
}
