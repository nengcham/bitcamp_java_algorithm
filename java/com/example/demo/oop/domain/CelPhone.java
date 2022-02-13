package com.example.demo.oop.domain;

/**
 * packageName: com.example.demo.phone.domain
 * fileName   : CelPhone
 * author     : choigeonil
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-09   choigeonil    최초 생성
 */
public class CelPhone extends Phone{

    protected boolean portable;
    protected String move;

    public CelPhone(String company, String kind, String move){
        super(kind, company);
        this.move = move;
    }

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        this.portable = portable;
    }

    public String getMove() {
        return move;
    }


    @Override
    public String toString() {
        return String.format("%s 의 %s을 사용해서 %s 라고하고 %s중에 통화한다."
               ,super.getCompany(), super.getKind(), super.getCall(), move);
    }
}
