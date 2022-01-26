package com.example.demo.calc;
/**
 * packageName: com.example.demo.calc
 * fileName   : CalcApp.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : 숫자 2개와 연산자 받아서 결과를 리턴하는 앱
 * variable   : [클래스변수] CALC_APP, [인스턴스변수] num1 opcode num2
 *              [로컬변수] res, result, [파라미터] num1 opcode num2
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-24   choigeonil    최초 생성
 * 2022-01-26   choigeonil    if절 작성, 4칙연산 추가
 */
public class CalcApp {
    public static String CALC_APP = "계산기";
    private int num1;
    private String opcode;
    private int num2;


    public String calc(int num1, String opcode, int num2){
        int res = 0;

        switch (opcode){
            case "+": res = num1 + num2; break;
            case "-": res = num1 - num2; break;
            case "*": res = num1 * num2; break;
            case "/": res = num1 / num2; break;
        }

        return String.format("%d %s %d = %d", this.num1, this.opcode, this.num2, res);
    }

}
