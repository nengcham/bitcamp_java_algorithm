package com.example.demo.algorithm;

/**
 * packageName: com.example.demo.algorithm
 * fileName   : Greedy
 * author     : choigeonil
 * date       : 2022-01-27
 * desc       :
 * 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
 * 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가
 * 매개변수로주어질 때, 체육수업을 들을 수 있는 학생의
 * 최댓값을 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 전체 학생의 수는 2명 이상 30명 이하입니다.
 * 체육복을 도난당한 학생의 수는 1명 이상
 * n명 이하이고 중복되는 번호는 없습니다.
 * 여벌의 체육복을 가져온 학생의 수는 1명
 * 이상 n명 이하이고 중복되는 번호는 없습니다.
 * 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
 * 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다.
 * 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며,
 * 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-27   choigeonil    최초 생성
 */
public class Greedy {
    public int solution(int n, int[] lost, int[] reserve) {
        System.out.println("===== 체육복 =====");
        int answer = 0;
        return answer;
    }
}
