package day0628;
// 학생의 국어점수, 영어점수, 수학점수, 총점, 평균을 각각 알맞는 이름의 변수에
// 저장하고 출력하세요
// 결과)
// 국어점수
// 80
// 영어점수
// 89
// 수학점수
// 88
// 총점
// 264
// 평균
// 88.0점

public class Ex11GradeBook {
    public static void main(String[] args) {
        int kor;
        int eng;
        int math;
        int sum;
        double avg;
        
        kor = 80;
        eng = 89;
        math = 88;
        sum = 264;
        avg = 88.0;
        
        System.out.println("국어점수");
        System.out.println(kor);
        System.out.println("영어점수");
        System.out.println(eng);
        System.out.println("수학점수");
        System.out.println(math);
        System.out.println("총합");
        System.out.println(sum);
        System.out.println("평균");
        System.out.println(avg + "점");
    }
}
