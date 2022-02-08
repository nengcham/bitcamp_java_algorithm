package com.example.demo.controller;

import com.example.demo.service.Feb07Service;
import com.example.demo.service.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : Feb07Controller
 * author     : choigeonil
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-07   choigeonil    최초 생성
 */
public class Feb07Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Feb07Service service = new Feb07ServiceImpl();
        while (true){
            System.out.println("MENU\n" +
                    "0. 종료\n" +
                    "1. 주사위(dice)\n" +
                    "2. 가위바위보(rps)\n" +
                    "3. 입력받은 두 수 사이에 있는 소수 구하기(getPrime)\n" +
                    "4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기(leapYear)\n" +
                    "5. 임의로 입력받은 숫자 맞추기(numberGolf)\n");
            switch (scanner.next()){
                case "0":
                    System.out.println("종료합니다."); return;
                case "1":
                    service.dice(scanner); break;
                case "2":
                    service.rps(scanner); break;
                case "3":
                    service.getPrime(scanner); break;
                case "4":
                    service.leapYear(scanner); break;
                case "5":
                    service.numberGolf(scanner); break;
                default:
                    System.out.println("잘못된 입력입니다."); break;
            }
        }
    }
}
