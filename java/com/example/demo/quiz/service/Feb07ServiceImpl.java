package com.example.demo.quiz.service;

import com.example.demo.quiz.service.Feb07Service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : Feb07ServiceImpl
 * author     : choigeonil
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-07   choigeonil    최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service {
    @Override
    public void dice(Scanner scanner) {
        int player = (int)(Math.random()*6)+1;
        int com = (int)(Math.random()*6)+1;

        System.out.println("플레이어 주사위눈: "+player+"\n"
                +"컴퓨터 주사위눈: "+ com);
        String res = "Draw";
        if (player != com) res = (player > com) ? "You Win!" : "You Lose!";
        System.out.println("승부결과: "+res);
    }

    @Override
    public void rps(Scanner scanner) {
        /**
         *  author     : 최건일
         *  desc       : 가위바위보
         *
         *  1. 사용자, 컴퓨터가 낸 가위바위보 Math.random()으로 생성
         *  2. 3항연산자를 사용하여 결과값을 출력 -> ()? : ;
         *  3. 값이 같으면 Draw
         *  4. com == (user-1)%3+1 이면 컴퓨터 Win
         *  5. 결과값 출력
         */

        System.out.println("### 가위바위보 게임 ###");
        int player = (int)(Math.random()*3)+1;
        int com = (int)(Math.random()*3)+1;
        String[] rps = {"가위", "바위", "보"};
        System.out.println("플레이어: "+rps[player-1]+"\n"+"컴퓨터: "+rps[com-1]);
        System.out.println((player == com) ? "Draw":(com > (player+1)%3) ? "Win" : "Lose");
        // (유저가 낸 가위바위보)%3+1 == 컴퓨터가 낸 가위바위보
        // 컴퓨터 승리
        // (유저가 낸 가위바위보)%3+1 != 컴퓨터가 낸 가위바위보
        // 유저 승리
        }


    @Override
    public void getPrime(Scanner scanner) {
        int count=0;
        System.out.println("100이하의 숫자를 입력(소수 구하기) : ");
        int number = scanner.nextInt();

        for (int i = 2; i < number; i++) {
            for(int j=2; j<=i;j++){
                if(i%j ==0){
                    count++;
                }
            }
            if(count==1){
                System.out.print(i+"\t");
            }
            count =0;
        }
    }

    @Override
    public void leapYear(Scanner scanner) {
        System.out.println("자바로 입력받은 연도가 윤년인지 평년인지 판단하기\n"+"연도를 입력하시오");
        int a = scanner.nextInt();
        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.println(a +"년은 윤년입니다");
        }else{
            System.out.println(a +"년은 평년입니다");
        }
        /*if(a%4==0){
            System.out.println(a+"년은 윤년입니다");
        }else if(a%400==0){
            System.out.println(a+"년은 윤년입니다");
        }else if(a%100!=0){
            System.out.println(a+"년은 평년입니다");
        }*/

        /*int input = 0;
        int a = 0;
        switch (input){
            case a%4==0 :
                System.out.println("윤년");
                break;
            case a%100!=0 :
                System.out.println("평년");
                break;
            case a%400==0 :
                System.out.println("윤년");
                break;}*/
    }

    @Override
    public void numberGolf(Scanner scanner) {
        System.out.println("5. 임의로 입력받은 숫자 맞추기\n"+"1~100 숫자 입력");
        int count = 0;
        int num = (int)(Math.random() * 100)+1;
        int num_enter = 0;
        Scanner cho = new Scanner(System.in);

        while (num != num_enter){
            num_enter = cho.nextInt();
            if(num_enter >= 101){
                System.out.println("숫자를 1부터 100까지 입력해주세요.");}
            else if(num > num_enter){
                System.out.println("UP");
                count++;
            }else if(num < num_enter){
                System.out.println("DOWN");
                count++;
            }
        }
        System.out.println("정답입니다\t" + count +"회 만에 맞췄어요.");
    }
}
