package com.example.demo.service;

/**
 * packageName: com.example.demo.service
 * fileName   : QuizService
 * author     : choigeonil
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-07   choigeonil    최초 생성
 */
public class QuizServiceImpl implements QuizService{
    @Override
    public void quiz1(String[] arr) {
        System.out.println("Q1. 팀별 과제를 출력하세요");
        String s = "";
        for (int i = 0; i < arr.length; i ++){
            if (i%5==0){
                s += "\n";
            }
            s += i + ":" + arr[i] + "\t";
        }
        System.out.println(s);
    }

    @Override
    public void quiz2(String[] arr) {
        String s;
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요.");
        s = "";
        String l = "강민";
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(l)){
                for (int j = 0; j < 3; j++){
                    s += arr[i + j * 5]+", ";}
                if (i==17){break;}
                //3 8 13
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz3(String[] arr) {
        String s;
        String l;

        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        s = "";
        l = "큐";
        for (int i = 5; i < arr.length; i++) {
            if (arr[i].equals(l)) {
                s = l + "을(를) 담당한 사람: " + arr[i%5];
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz4(String[] arr) {
        String s;

        System.out.println("Q4. 팀원별 과제 수를 출력하세요.");
        s = "";
        int[] count = new int[5];
        for(int i = 0; i < 5; i++){
            for (int j = 5; j < arr.length; j++) {
                if (j % 5 == i) {
                    count[i]++;
                }
            }
        s +=arr[i] +"("+(count[i])+")개, ";
        }
        System.out.println(s);
    }
}
