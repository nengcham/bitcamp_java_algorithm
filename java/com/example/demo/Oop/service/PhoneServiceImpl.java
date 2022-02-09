package com.example.demo.Oop.service;

import com.example.demo.Oop.domain.CelPhone;
import com.example.demo.Oop.domain.GalPhone;
import com.example.demo.Oop.domain.IPhone;
import com.example.demo.Oop.domain.Phone;

import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : PhoneServiceImpl
 * author     : choigeonil
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08   choigeonil    최초 생성
 */
public class PhoneServiceImpl implements PhoneService {
    @Override
    public void usePhone(Phone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useCelPhone(CelPhone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useIPhone(IPhone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useGalPhone(GalPhone phone) {
        System.out.println(phone.toString());
    }
}
