package com.example.demo.bmi;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiApp.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : 이름, 키, 몸무게를 입력받아 BMI 결과를 리턴하는 앱
 * variable   : [클래스변수] BMI_APP, [인스턴스변수] name height weight
 *              [로컬변수] res1, res2, [파라미터] name height weight
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25   choigeonil    최초 생성
 */
public class BmiApp {
    public static String BMI_APP = "BMI 앱";
    private String name;
    private double height;
    private double weight;

    public String bmi(String name, double height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
        double res1 = weight / (height * height);

        if (res1 < 18.5) {
            String res2 = String.format("%s님의 BMI 수치는 %.2f 저체중입니다.", this.name, res1);
            return res2;
        } else if (res1 < 23) {
            String res2 = String.format("%s님의 BMI 수치는 %.2f 정상입니다.", this.name, res1);
            return res2;
        } else if (res1 < 25) {
            String res2 = String.format("%s님의 BMI 수치는 %.2f 과체중입니다.", this.name, res1);
            return res2;
        } else {
            String res2 = String.format("%s님의 BMI 수치는 %.2f 비만입니다.", this.name, res1);
            return res2;
        }

//        String res2 = String.format("%s님의 BMI 수치는 %.2f 정상입니다.", this.name, res1);
//        return res2;
    }



}
