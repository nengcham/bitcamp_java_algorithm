package com.example.demo.service;

import com.example.demo.domain.BmiDTO;

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
public class BmiService {
    public String execute(BmiDTO bmi) {
        double bmires = bmi.getWeight() / bmi.getHeight() * bmi.getHeight();
        String res = "";
        if (bmires < 18.5){
            res = "저체중";
        } else if (bmires < 23) {
            res = "정상";
        } else if (bmires < 25) {
            res = "과체중";
        } else {
            res = "비만";
        }
        
        
        return String.format("%s님의 BMI는 %.2f, %s 입니다.", bmi.getName(), bmires, res);
    }
}
