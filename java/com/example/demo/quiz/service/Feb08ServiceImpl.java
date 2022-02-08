package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName   : Feb08ServiceImpl
 * author     : choigeonil
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08   choigeonil    최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void lotto(Scanner scanner) {
        int[] comNum = new int[6];
        String s = "번호: ";
        while (true){
            System.out.println("### 로또 ###\n" +
                    "0.종료 1.무작위 로또번호 받기 2.로또게임");
            switch (scanner.next()){
                case "0" :
                    System.out.println("EXIT"); return;
                case "1":
                    for (int i = 0; i < 6; i++){
                        comNum[i] = (int)(Math.random()*45)+1;
                        for (int j = 0; j < i; j++){
                            if (comNum[i] == comNum[j]){
                                i--; break;
                            }
                        }
                    }
                    for (int i = 0; i < 6 ; i++){
                        s += comNum[i]+" ";
                    }
                    System.out.println(s); break;
                case "2":
                    for (int i = 0; i < 6; i++){
                        comNum[i] = (int)(Math.random()*45)+1;
                        for (int j = 0; j < i; j++){
                            if (comNum[i] == comNum[j]){
                                i--; break;
                            }
                        }
                    }
                    for (int i = 0; i < 6 ; i++){
                        s += comNum[i]+" ";
                    }
                    System.out.println("1~45 사이의 번호를 중복없이 6번 입력하세요");
                    int[] userNum = new int[6];
                    String u = "입력한 번호: ";
                    for (int m = 0; m < 6; m++){
                        userNum[m] = scanner.nextInt();
                        u += userNum[m] + " ";
                    }
                    int hit = 0;
                    for (int n = 0; n < 6; n++)
                        for (int p = 0; p < 6; p++)
                            if (comNum[n] == userNum[p]){
                                hit++; break;
                            }
                    String rank = "";
                    if (hit == 6){
                        rank = "축하합니다! 1등입니다!";
                    } else if (hit == 5){
                        rank = "축하합니다! 2등입니다!";
                    } else if (hit == 4){
                        rank = "축하합니다! 3등입니다!";
                    } else {
                        rank = "아쉽게도 꽝입니다.";
                    }
                    System.out.println(u+"\n"+s+"\n"+"맞춘 갯수: "+hit+"\n"+rank);
                    break;
                default:
                    System.out.println("WRONG"); break;
            }
        }
    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void booking(Scanner scanner) {

    }

    @Override
    public void bank(Scanner scanner) {

    }

    @Override
    public void gugudan(Scanner scanner) {

    }
}
