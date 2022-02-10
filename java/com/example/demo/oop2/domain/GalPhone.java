package com.example.demo.oop2.domain;

/**
 * packageName: com.example.demo.oop2.domain
 * fileName   : GalPhone
 * author     : choigeonil
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-09   choigeonil    최초 생성
 *
 * %s 제조사에서 만든 %s 제품을 사용해서 %s 로 결제한다.
 */
public class GalPhone extends IPhone{
    private String pay;

    public GalPhone(String company, String kind){
        super(company, kind, "이동");
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return String.format("%s 제조사에서 만든 %s 제품을 사용해서 %s 로 결제한다.",
                super.getCompany(), super.getKind(), pay);
    }
}
