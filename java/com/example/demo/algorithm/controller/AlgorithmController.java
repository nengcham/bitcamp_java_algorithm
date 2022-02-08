package com.example.demo.algorithm.controller;

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
public class AlgorithmController {
    public void excute(Scanner scanner) {
        while (true){
            System.out.println("[서브메뉴]\n0.Exit" +
                    "1.김아름 2.장원종 3.유재혁 4.강민 5.최건일");
            switch (scanner.next()){
                case "0" :
                    System.out.println("EXIT"); return;
                case "1" :
                    System.out.println("[소메뉴]\n[김아름] 0.Exit 1.Stack 2.Queue 3.Heap");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("EXIT"); return;
                        case "1": break;
                        case "2": break;
                        case "3": break;
                        default:
                            System.out.println("Wrong Number"); break;
                    }
                case "2" :
                    System.out.println("[소메뉴]\n[장원종] 0.Exit 1.BruteForce 2.DFS 3.BFS");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("EXIT"); return;
                        case "1": break;
                        case "2": break;
                        case "3": break;
                        default:
                            System.out.println("Wrong Number"); break;
                    }
                case "3" :
                    System.out.println("[소메뉴]\n[유재혁] 0.Exit 1.Hash 2.Sort");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("EXIT"); return;
                        case "1":
                            break;
                        case "2": break;
                        default:
                            System.out.println("Wrong Number"); break;
                    }
                case "4" :
                    System.out.println("[소메뉴]\n[강민] 0.Exit 1.DP 2.Graph");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("EXIT"); return;
                        case "1": break;
                        case "2": break;
                        default:
                            System.out.println("Wrong Number"); break;
                    }
                case "5" :
                    System.out.println("[소메뉴]\n[최건일] 0.Exit 1.BinarySearch 2.Greedy");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("EXIT"); return;
                        case "1": break;
                        case "2": break;
                        default:
                            System.out.println("Wrong Number"); break;
                    }
                default:
                    System.out.println("Wrong Number"); break;
                    
                    
                    
            }
        }
    }
}
