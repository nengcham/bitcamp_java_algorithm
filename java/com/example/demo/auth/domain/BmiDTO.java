package com.example.demo.auth.domain;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiApp.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : 이름, 키, 몸무게를 입력받아 BMI 결과를 리턴하는 앱
 * variable   : [클래스변수] BMI_APP,  [인스턴스변수] name height weight
 *              [로컬변수] res1, res2, [파라미터] name height weight
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25   choigeonil    최초 생성
 */
public class BmiDTO extends Object{
    public static String BMI_TITLE = "BMI 앱";
    private String name;
    private double height;
    private double weight;

    private final static BmiDTO bmiDTO = new BmiDTO();
    private BmiDTO(){}
    public static BmiDTO getInstance(){return bmiDTO;}

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getWeight(){
        return weight;
    }
    public void  setWeight(double weight){
        this.weight = weight;
        
    }
}
