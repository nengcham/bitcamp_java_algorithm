package com.example.demo.auth.domain;

/**
 * packageName: com.example.demo.domain
 * fileName   : SubjectDTO
 * author     : choigeonil
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-03   choigeonil    최초 생성
 */
public class AlgoDTO {
    private String name;
    private String subject;
    private String subject1;
    private String subject2;

    private final static AlgoDTO algoDTO = new AlgoDTO();
    private AlgoDTO(){}
    public static AlgoDTO getInstance(){return algoDTO;}

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject1(){
        return subject1;
    }
    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }
    public String getSubject2(){
        return subject2;
    }
    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }
}
