package day0630;
//사용자로부터 나이를 입력받아서
//6세미만: 영유아입니다.
//~13세이하: 어린이입니다.
//~18세이하: 청소년입니다.
//그외: 성인입니다.
//가 출력되는 프로그램을 작성하시오
import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        
        int age;
        Scanner scn = new Scanner(System.in);
        
        System.out.print("나이 입력:");
        age = scn.nextInt();
        
        if (age < 6) {
            System.out.println("영유아입니다");
        } else if(age <= 13) {
            System.out.println("어린이입니다");
        } else if(age <= 18) {
            System.out.println("청소년입니다");
        } else {
            System.out.println("성인입니다");
        }
        
        scn.close();
    }
}
