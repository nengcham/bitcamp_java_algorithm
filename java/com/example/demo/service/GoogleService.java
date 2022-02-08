package com.example.demo.service;

import com.example.demo.domain.GoogleDTO;

/**
 * packageName: com.example.demo.google
 * fileName   : GoogleDemo.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : 구글 앱을 실행하는 컨트롤러
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25   choigeonil    최초 생성
 */
public class GoogleService {
    public String execute(GoogleDTO google) {
        return String.format("%s을(를) 검색한 결과입니다.", google.getSearch());
    }
    
}
