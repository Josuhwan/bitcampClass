package day0630;

import java.util.Scanner;

// 숙제 1.
// 2가지 검증 방법을 각각 사용하여
// 사용자의 나이에 따른
// 영유아, 어린이, 청소년, 성인을 출력하는 프로그램을 작성하시오.
// 기네스북에 다르면, 세상에서 가장 나이가 많았던 사람의 나이는 122세였습니다.
public class AgeChecker1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이입력: ");
        int age = scanner.nextInt();

        String result;
        
        if(age > 18 && age <= 122) {
            result = "성인";
        } else if(age >= 13 && age <= 18) {
            result = "청소년";
        } else if(age >= 6 && age < 13) {
            result = "어린이";
        }  else if(age >= 1 && age < 6) {
            result = "영유아";
        } else {
            result = "잘못 입력하셨습니다.";
        }
        
        System.out.println("사용자의 나이: " +age +"살");
        System.out.printf("[%s]\n", result);
        System.out.println("\n ================ \n");
       
       
        if(age > 0 && age <= 122) {
            if (age >= 18) {
                result = "성인";
            } else if (age >= 13) {
                result = "청소년";
            } else if (age >= 6) {
                result = "어린이";
            } else  {
                result = "영유아";
            }
            System.out.printf("사용자의 나이: %2d살\n", age);
            System.out.printf("[%s]\n", result);
                
        } else {
            // 점수가 올바른 범위에 속하지 않으므로 경고 메시지만 출력
            System.out.println("잘못 입력하셨습니다.");
            
        }
        System.out.println("\n ================ \n");
        
        scanner.close();
  
    }
}
