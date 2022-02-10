package com.example.demo.oop2.domain;

/**
 * packageName: com.example.demo.oop2.domain
 * fileName   : IPhone
 * author     : choigeonil
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-09   choigeonil    최초 생성
 *
 * %s 제조사에서 만든 %s를 사용해서 %s중에 %s를 검색한다.
 */
public class IPhone extends CelPhone{
    private String search;

    public IPhone(String company, String kind, String move){
        super(company, kind, move);
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return String.format("%s 제조사에서 만든 %s를 사용해서 %s중에 %s를 검색한다.",
                super.getCompany(), super.getKind(), super.getMove(), search);
    }
}
