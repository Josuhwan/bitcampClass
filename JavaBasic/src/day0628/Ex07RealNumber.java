package day0628;
// 기본형 데이터타입 01
// 실수형(real number)

// 실수란? 소숫점이 존재하는 숫자 -> 모든 숫자
// 4 -> 실수(.000000000이 생략)
// 4.3 -> 실수
// 3.0 -> 실수
public class Ex07RealNumber {
    public static void main(String[] args) {
         // 1. double 변수 myDouble을 만들어서 4.32를 넣어보자
        double myDouble = 4.32;
         // 2. myDouble을 화면에 출력해보자.
        System.out.println(myDouble);
         // 3. myDouble에 4를 넣어보자
        myDouble = 4;
         // 4. myDouble을 화면에 출력해보자.
        System.out.println(myDouble);
        
        // 단, float 형 변수에 값을 넣을 때에는
        // 해당 실수의 데이터타입이 double이 아닌 float인것을 알리기 위하여
        // 실수의 맨 끝에 f를 붙여준다.
        
        // 5. float 변수  myFloat을 선언하자
        float myFloat;
        // 6. myFloat;
        myFloat = 4.3f;
        // 7. myFloat을 화면에 출력해보자
        System.out.println(myFloat);
        
    }
}
