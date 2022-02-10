package com.example.demo.oop2.domain;

/**
 * packageName: com.example.demo.oop2.domain
 * fileName   : Phone
 * author     : choigeonil
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-09   choigeonil    최초 생성
 *
 * %s 제조사의 %s를 사용하여 %라고 통화한다.
 */
public class Phone {
    protected String company;
    protected String kind;
    protected String call;

    public Phone(String company, String kind){
        this.company = company;
        this.kind = kind;
    }

    public String getCompany() {
        return company;
    }


    public String getKind() {
        return kind;
    }


    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return String.format("%s 제조사의 %s를 사용하여 %s라고 통화한다.",
                company, kind, call);
    }
}
