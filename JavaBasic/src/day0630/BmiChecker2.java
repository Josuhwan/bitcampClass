package day0630;
// 숙제 2.
// 사용자로부터 키와 몸무게를 입력 받아서
// BMI를 계산하여
// 비만도를 출력하는 프로그램
// 단, 기네스북에 따르면 세계에서 가장 키가 컸던 사람의 키는
// 2.72m였습니다.
// 또한 가장 몸무게가 무거웠던 사람의 몸무게는 635kg이었습니다.
// 만약 사용자가 잘못된 값을 입력할 경우, 더이상 추가적인 입력 없이
// 경고 메시지 출력 후 프로그램이 종료되도록 코드를 작성하시오

import java.util.Scanner;

public class BmiChecker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        final double STANDARD_1 = 18.5;
        final double STANDARD_2 = 23;
        final double STANDARD_3 = 25;

        System.out.print("키를 m단위로 입력: ");
        double height = scanner.nextDouble();
 
        String result;
        
        if(height <= 2.72 && height > 0.1) {
            System.out.print("몸무게를 kg단위로 입력: ");
            double weight = scanner.nextDouble();
            double bmi = weight / height / height;
            if(weight <= 635 && weight > 1) {
                if (bmi < STANDARD_1) {
                    result = "저체중";
                } else if (bmi < STANDARD_2) {
                    result = "정상체중";
                } else if (bmi < STANDARD_3) {
                    result = "과체중";
                } else {
                    result = "비만";
                }
                System.out.printf("키: %.2f m 몸무게: %.2f kg\n", height, weight);
                System.out.printf("BMI: %.3f 비만도: %s\n", bmi, result);
            } else {
                System.out.println("잘못입력하셨습니다. 종료합니다");
            }
        } else {   
            System.out.println("잘못입력하셨습니다. 종료합니다");
        }
        
        scanner.close();
    }
}
