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
        //



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
