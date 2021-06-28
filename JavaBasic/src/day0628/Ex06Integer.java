package day0628;
// 기본형 데이터타입 01
// 정수형(Integer)
// 정수란? 소수점이 존재하지 않는 숫자들
// 자바의 경우, 기본형 데이터타입을
// 이진법으로 변환하여 저장한다.
// 정수형 기본 데이터타입은 4가지가 있다.
// byte: 8비트 -> 8자리 2진법 숫자
// short: 16비트 -> 16자리 2진법 숫자
// int: 32비트 -> 32자리 2진법 숫자
// long: 64비트 -> 64자리 2진법 숫자
// 비트란? 2진법 자릿수를 뜻한다.

// 컴퓨터의 경우, 맨 앞자리를 기준으로 하여 0이면 +, 1이면 -를 뜻한다.
// 즉, byte를 기준으로 해서 치ㅗ대값은 0111 1111, 즉 127이 된다.
// 최소값은 1000 0000 즉 -128이 된다.
// 만약 범위를 벗어나는 값을 저장하는 경우에는 최대값보다 큰 값이 들어와서
// 부정확한 값으로 표시가 되는 것을 우리는  overflow라고 하고
// 반대로 최소값보다 작은 값이 들어와서 부정확한 값으로 표시가 되는 것을
// 우리는 underflow라고 한다!

public class Ex06Integer {
    public static void main(String[] args) {   
        // 1. byte 변수 myByte를 만들어서 20을 넣고 출력해라
                byte myByte;
                myByte = 20;
                System.out.println(myByte);
        // 2. short 변수 myShort을 만들어서 150을 넣고 출력해라
                short myShort;
                myShort = 150;
                System.out.println(myShort);
        // 3. int 변수 myInt를 만들어서 8982을 넣고 출력해라
                int myInt;
                myInt = 8982;
                System.out.println(myInt);
        // 4. long 변수 myLong을 만들어서 9999999을 넣고 출력해라
                long myLong;
                myLong = 9999999;
                System.out.println(myLong);
        // 5. 4번까지 코드를 작성하고 실행이 끝나면 myByte에 150을 넣어라
//                myByte = 150;
//                System.out.println(myByte);
               
    }
}
