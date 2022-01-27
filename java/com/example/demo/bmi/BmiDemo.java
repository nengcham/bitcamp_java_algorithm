package com.example.demo.bmi;
/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiDemo.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : BMI 앱을 실행하는 컨트롤러
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25   choigeonil    최초 생성
 */
public class BmiDemo {
    public String execute(String name, double height, double weight) {
        BmiApp bmiApp = new BmiApp();
        return bmiApp.getbmi(name, height, weight);
    }
}
