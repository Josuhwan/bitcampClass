package day0628;
// 기본형 데이터타입 03
// 문자형(Character)

/* 기본형 데이터타입 중 문자형 데이터타입은 <char>
 * 맨처음 프로그램 언어에서 char는 7비트의 크기를 가지고 있었지만
 * 이제는 64비트(별로 안중요)
 * 
 * char는 알파벳의 경우, ASCII테이블이라는 특수한 문자표를 사용
 * 값을 저장하거나 출력할때 2진법 값을 자동으로 문자로변환.
 * 우리가 char 공간에 값을 저장할 때에는 
 * 문자1개를 ''안에 넣어 저장하거나 혹은 해당글자의 10진법 값을 
 * 저장하는 방법을 사용한다.
 * 
 * 하지만 char 데이터타입은 사용되지 않는데,
 * 한번에 한개의 글자만 저장가능하기 때문이다!
 */
public class Ex08Character {
    public static void main(String[] args) {
        //char변수 myChar를 선언
        char myChar;
        //myChar에 대문자 A를 저장
        myChar = 'A';
        //화면서 myChar를 출력
        System.out.println(myChar);
        //myChar에 10진법 97을 저장
        myChar = 97;
        //화면에 myChar을 출력
        System.out.println(myChar);
        
    }
}
