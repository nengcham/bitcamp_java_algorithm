package com.example.demo.oop2.domain;

/**
 * packageName: com.example.demo.oop2.domain
 * fileName   : CelPhone
 * author     : choigeonil
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-09   choigeonil    최초 생성
 *
 * %s 제조사의 %s 을 사용해서 %s라고 하고 %s중에 통화한다.
 */
public class CelPhone extends Phone{
    protected String move;



    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return String.format("%s 제조사의 %s 을 사용해서 %s라고 하고 %s중에 통화한다.",
                super.getCompany(), super.getKind(), super.getCall(), move);
    }
}
