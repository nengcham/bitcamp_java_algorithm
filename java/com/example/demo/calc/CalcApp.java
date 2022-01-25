package com.example.demo.calc;
/**
 * 숫자 2개와 연산자 1개를 받아서 계산하는 앱을 작성하시오
 * Int, String
 **/
public class CalcApp {
    static String CALC_APP = "계산기";
    int num1;
    int num2;
    String opcode;

    public String calc(int num1, int num2, String opcode){
        this.num1 = num1;
        this.num2 = num2;
        this.opcode = opcode;
        int res = num1 + num2;
        return String.format("%d %s %d = %d", this.num1, this.opcode, this.num2, res);
    }

}
