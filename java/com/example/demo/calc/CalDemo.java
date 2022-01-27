package com.example.demo.calc;
/**
 * packageName: com.example.demo.calc
 * fileName   : CalDemo.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : 계산기 앱을 실행하는 컨트롤러
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-24   choigeonil    최초 생성
 */
public class CalDemo {
    public String execute(int num1, String opcode, int num2) {
        CalcApp calcApp = new CalcApp();
        return calcApp.calc(num1, opcode, num2);
    }
}
