package com.example.demo.Oop.service;

import com.example.demo.Oop.domain.CelPhone;
import com.example.demo.Oop.domain.GalPhone;
import com.example.demo.Oop.domain.IPhone;
import com.example.demo.Oop.domain.Phone;

import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : PhoneService
 * author     : choigeonil
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08   choigeonil    최초 생성
 */
public interface PhoneService {
    void usePhone(Phone phone);
    void useCelPhone(CelPhone phone);
    void useIPhone(IPhone phone);
    void useGalPhone(GalPhone phone);
}
