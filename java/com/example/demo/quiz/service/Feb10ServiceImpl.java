package com.example.demo.quiz.service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName   : Feb09ServiceImpl
 * author     : choigeonil
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-09   choigeonil    최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service {
    Scanner scanner = new Scanner(System.in);
    /*
     *  1인분
     * */
    @Override
    public void bubbleSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        System.out.println("### bubbleSort ###");
    }

    @Override
    public void insertionSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        System.out.println("### insertionSort ###");
    }

    @Override
    public void selectionSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        System.out.println("### selectionSort ###");
    }
    /*
     *  1인분
     * */
    @Override
    public void quickSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        System.out.println("### quickSort ###");
    }

    @Override
    public void mergeSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        System.out.println("### mergeSort ###");
    }

    @Override
    public void magicSquare() {
        System.out.println("### magicSquare ###");

    }

    @Override
    public void zigzag() {
        /**
         *  AUTHOR : 최건일
         *
         * 1. 문제 : 랜덤한 정수를(n) 생성하여 행,열 n*n의 숫자배열을 지그재그로 생성
         *  ex) 랜덤한 정수 ranNum = 5
         *      출력 :  1  2  3  4  5
         *            10  9  8  7  6
         *            11 12 13 14 15
         *            20 19 18 17 16
         *            21 22 23 24 25
         *
         * 2. 랜덤한정수 ranNum을 생성하여 2차원배열 int[][] arr의 length로 설정
         * 2-1. 행(int i)이 홀수일 경우 (i%2==0) 오름차순 출력
         * 2-1-1. arr[i][j] = count++ 출력
         * 2-2. 행(int i)이 짝수의 경우(else) 내림차순 출력
         * 2-2-1. arr[i][ranNum-1-j] === count++ 출력
         * 3. count%ranNum==0 줄바꿈(\n)
         */

        int ranNum = (int)(Math.random()*10+1);
        System.out.println("### 지그재그 ###\n" +
                "1 ~ 10 사이의 무작위 정수 "+ "["+ranNum+"]" +" 지그재그를 출력합니다.");

        int[][] arr =new int[ranNum][ranNum];
        int count = 1;
        for(int i = 0; i < ranNum; i++){
            for(int j = 0; j < ranNum; j++){
                if (i % 2 == 0){
                    arr[i][j] = count;
                } else {
                    arr[i][ranNum-1-j] = count;
                }
                count++;
            }
        }
        for(int i = 0; i < ranNum; i++){
            for(int j = 0; j < ranNum; j++){
                System.out.print(arr[i][j] + "\t");
                if (count%ranNum==0){
                    System.out.println();
                }
                count++;
            }
        }
    }

    @Override
    public void rectangleStarPrint() {
        System.out.println("### rectangleStarPrint ###");

    }

    @Override
    public void triangleStarPrint() {
        System.out.println("### triangleStarPrint ###");

    }


}
