package com.example.demo.controller;

import com.example.demo.domain.AlgoDTO;

/**
 * packageName: com.example.demo.controller
 * fileName   : TempC4
 * author     : choigeonil
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-03   choigeonil    최초 생성
 */
public class TempC4 {
    public static void main(String[] args) {
        AlgoDTO[] team = new AlgoDTO[5];
        String[] fiveName = new String[5];
        String[] fiveSubject = new String[15];

        fiveName[0] = "김아름";
        fiveName[1] = "유재혁";
        fiveName[2] = "장원종";
        fiveName[3] = "강 민";
        fiveName[4] = "최건일";

        fiveSubject[0] = "스택";
        fiveSubject[1] = "해시";
        fiveSubject[2] = "BruteForce";
        fiveSubject[3] = "DP";
        fiveSubject[4] = "BinarySearch";
        fiveSubject[5] = "큐";
        fiveSubject[6] = "Sort";
        fiveSubject[7] = "DFS";
        fiveSubject[8] = "Graph";
        fiveSubject[9] = "Greedy";
        fiveSubject[10] = "힙";
        fiveSubject[11] = "";
        fiveSubject[12] = "BFS";
        fiveSubject[13] = "";
        fiveSubject[14] = "";
        for (int i = 0; i < team.length; i++){
            team[i] = new AlgoDTO();
            team[i].setName(fiveName[i]);
            team[i].setSubject(fiveSubject[i]);
            team[i].setSubject1(fiveSubject[i+5]);
            team[i].setSubject2(fiveSubject[i+10]);
        }
        for (int i = 0; i < fiveName.length; i++){
            System.out.println(String.format("%s: %s, %s, %s",team[i].getName(), team[i].getSubject(), team[i].getSubject1(), team[i].getSubject2()));        }
    }
}
