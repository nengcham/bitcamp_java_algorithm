package com.example.demo.auth.domain;
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
 * 2022-01-07   choigeonil    thih. 오류수정
 */
public class CalcDTO {
    public static String CALC_TITLE = "계산기";
    private int num1;
    private String opcode;
    private int num2;

    public int getNum1(){
        return num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public String getOpcode(){
        return opcode;
    }
    public void setOpcode(String opcode){
        this.opcode = opcode;
    }
    public int getNum2(){
        return num2;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
}
