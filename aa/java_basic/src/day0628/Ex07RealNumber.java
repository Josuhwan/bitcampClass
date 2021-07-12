package day0628;
//기본형 데이터타입 02
//실수형(Real number)

/*실수? 소숫전이 존재하는 숫자 ->모든숫자
 float:  32비트
 double: 64비트
 자바에서는 코즈상의 실수를 기본적으로 double로 인식
 따라서 우리도 실수형 데이터타입을 사용해야할 경우 double로 사용!

 */
public class Ex07RealNumber {
    public static void main(String[]args) {
//1.double 변수 myDouble을 만들어 4.32넣기
        double myDouble = 4.32;
//2.myDouble을 화면에 출력하기
        System.out.println(myDouble);
//3.myDouble에 4넣기
        myDouble = 4;
//4.myDouble을 화면에 출력하기
        System.out.println(myDouble);        
   
/*단,float 형 변수에 값을 넣을 떄에는 해당실수의 데이터 타입이
 * double이 아닌 float인것을 알리기위해 접미사 f를 붙인다.
 */
//        5. float변수 myFloat을 선언
        float myFloat;
//        6. myFloat에 4.3을 입력
        myFloat = 4.3f;
//        7. myFloat를 화면에 출력
        System.out.println(myFloat);
        
        
    }
}
