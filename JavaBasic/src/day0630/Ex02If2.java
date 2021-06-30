package day0630;
// 1. number를 5로 초기화 하고
//    0보다 큰지 확인해서
//    0보다 크면 "양의 정수입니다"라고 출력되는 코드를 작성하시오
// 2. 사용자로부터 나이를 입력 받아서
//    19세 미만일 경우 "미성년자입니다" 라고 출력되게 코드를 작성하시오
// 3. 사용자로부터 숫자를 하나 입력 받아서
//    그 숫자가 홀수이면 "홀수입니다" 가 출력되게 코드를 작성하시오  
// 4. 사용자로부터 숫자를 입력받아서
//    해당 숫자가 10부터 99사이의 두자리 숫자이면
//    "두자리 숫자입니다" 라고 출력되게 코드를 작성하시오
// 5. 사용자가 숫자를 입력하면
//    그 숫자가 음수이거나 1000보다 크면
//    "잘못 입력하셨습니다." 가 출력되게 코드를 작성하시오

import java.util.Scanner;

public class Ex02If2 {
    public static void main(String[] args) {
        
        int number;
        number = 5;
        
        if(number > 0) {
            System.out.println("양의 정수입니다");
        }
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("2. 나이를 입력해주세요: ");
        
        int age = scanner.nextInt();
        
        if(age < 19) {
            System.out.println("미성년자입니다");
        }
        
        System.out.print("3. 숫자를 입력해주세요: ");
        
        number = scanner.nextInt();
        
        if(number % 2 != 0) {
            System.out.println("홀수입니다");
        }
        
        System.out.print("4. 숫자를 입력해주세요: ");
        
        number = scanner.nextInt();
        
        if(number >= 10 && number <= 99) {
            System.out.println("두자리숫자입니다");
        
        }
        
        System.out.print("5. 숫자를 입력해주세요: ");
        
         number = scanner.nextInt();
        
        if(number < 0 || number > 1000) {
            System.out.println("잘못입력하셨습니다");
        
            
        scanner.close();
        }
    }
}
