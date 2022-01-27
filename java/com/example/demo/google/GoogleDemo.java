package com.example.demo.google;
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
public class GoogleDemo {
    public String execute(String search) {
        GoogleApp googleApp = new GoogleApp();
        return googleApp.getgoogle(search);

    }
}
