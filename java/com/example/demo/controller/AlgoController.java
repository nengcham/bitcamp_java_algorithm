package com.example.demo.controller;

import com.example.demo.algorithm.BinSearch;
import com.example.demo.algorithm.Greedy;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController2
 * author     : choigeonil
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-27   choigeonil    최초 생성
 */
public class AlgoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinSearch binSearch = new BinSearch();
        Greedy greedy = new Greedy();

        while (true){
            System.out.println("[Menu] 0.exit\n" +
                    "[김아름]1. stack \t" +
                    "2. queue \t" +
                    "3. heep \n" +
                    "[유재혁]4. hash \t" +
                    "5. sort \n" +
                    "[장원종]6. brute force \t" +
                    "7. dfs \t" +
                    "8. bfs \n" +
                    "[강민]9. dp \t" +
                    "10. graph \n" +
                    "[최건일]11. bin search \t" +
                    "12. greedy \n");
            switch (scanner.next()){
                case "0" : return;
                case "11" :
//                    System.out.println(binSearch.solution());
                    break;
                case "12" :
//                    System.out.println(Greedy.solution());
                    break;
                default:
                    System.out.println("Wrong Number"); break;
                    
                    
                    
            }
        }
    }
}
