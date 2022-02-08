package com.example.demo.student.service;

import com.example.demo.student.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName   : StudentService
 * author     : choigeonil
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-07   choigeonil    최초 생성
 */
public interface StudentService {
    String getBmi(BmiDTO bmi);
    String calc(CalcDTO calc);
    String search(GoogleDTO google);
    String getGrade(GradeDTO grade);
    String login(LoginDTO login);
}
