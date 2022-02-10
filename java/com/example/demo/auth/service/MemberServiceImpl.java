package com.example.demo.auth.service;

import com.example.demo.auth.domain.*;

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
public class MemberServiceImpl implements MemberService {
    @Override
    public String getBmi(BmiDTO bmi) {
        /**
         * BMI = w / h * h
         * 고도 비만 : 35 이상
         * 중(重)도 비만 (2단계 비만) : 30 - 34.9
         * 경도 비만 (1단계 비만) : 25 - 29.9
         * 과체중 : 23 - 24.9
         * 정상 : 18.5 - 22.9
         * 저체중 : 18.5 미만
         * */
        double bmires = bmi.getWeight() / (bmi.getHeight() * bmi.getHeight())*10000;
        String res = "";
        if (bmires < 18.5){
            res = "저체중";
        } else if (bmires < 23) {
            res = "정상";
        } else if (bmires < 25) {
            res = "과체중";
        } else if (bmires < 30) {
            res = "경도비만";
        } else if (bmires < 35) {
            res = "중도비만";
        } else {
            res = "고도비만";
        }
        return String.format("%s님의 BMI는 %.2f, %s 입니다.", bmi.getName(), bmires, res);
    }

    @Override
    public String calc(CalcDTO calc) {
        int res = 0;
        switch (calc.getOpcode()){
            case "+": res = calc.getNum1() + calc.getNum2(); break;
            case "-": res = calc.getNum1() - calc.getNum2(); break;
            case "*": res = calc.getNum1() * calc.getNum2(); break;
            case "/": res = calc.getNum1() / calc.getNum2(); break;
        }
        return String.format("%d %s %d = %d", calc.getNum1(), calc.getOpcode(), calc.getNum2(), res);
    }

    @Override
    public String search(GoogleDTO google) {
        return String.format("%s을(를) 검색한 결과입니다.", google.getSearch());
    }

    @Override
    public String getGrade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3 ;
        String pass = (avg >=60) ? "합격" : "불합격";
        return String.format(
                " * ########## %s ##########\n" +
                        " * 이름: %s\n" +
                        " * > 국어: %d점 \n" +
                        " * > 영어: %d점 \n" +
                        " * > 수학: %d점\n" +
                        " * 총점: %d점 \n" +
                        " * 평균(점수): %d점\n" +
                        " * 합격여부: %s\n" +
                        " * #######################",
                GradeDTO.GRADE_TITLE, grade.getName(), grade.getKor(), grade.getEng(), grade.getMath(), total, avg, pass);
    }

    @Override
    public String login(UserDTO login) {
        return (login.getPw().equals(login.getPASSWORD())) ? String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공", login.getName(), login.getPw())
                : String.format("%s 님의 ID는 맞고, 비번 %s가 틀립니다. 로그인 실패", login.getId(), login.getPw());
    }
}
