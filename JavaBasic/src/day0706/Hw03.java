package day0706;
// 숙제 1.
// BmiChecker를 메소드화 시키시오

import util.ScannerUtil;
import java.util.Scanner;
public class Hw03 {
    
    static final double HEIGHT_MAX = 2.72;
    static final double WEIGHT_MAX = 635;
    static final double BMI_STANDARD_I = 18.5;
    static final double BMI_STANDARD_II = 23;
    static final double BMI_STANDARD_III = 25;
    static final int SIZE = 5;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] heightArray = new double[SIZE];
        double[] weightArray = new double[SIZE];
        int index = 0;
        
        while (true) {
            int userChoice = ScannerUtil.nextInt(scanner, "1. 입력 2. 출력 3. 종료");
            if (userChoice == 1) {

                if (index < SIZE) {                   
                    double temp;
                    
                    temp = ScannerUtil.nextDouble(scanner, "키", 0.0, HEIGHT_MAX);

                    heightArray[index] = temp;

                    temp = ScannerUtil.nextDouble(scanner, "몸무게", 0.0, WEIGHT_MAX);

                    weightArray[index] = temp;

                    index++;

                } else {
                   
                    System.out.println("더이상 입력하실 수 없습니다.");
                }

            } else if (userChoice == 2) {
               
                if (index > 0) {
                   
                    for (int i = 0; i < index; i++) {
                        System.out.println("-----------------------");
                        System.out.printf("\t%d번째 정보\n", i + 1);
                        System.out.println("-----------------------");
                        System.out.printf("키: [%.2f]m 몸무게: [%.2f]kg\n", heightArray[i], weightArray[i]);
                        double bmi = weightArray[i] / heightArray[i] / heightArray[i];
                        
                        result(bmi);
                    }

                } else {

                    System.out.println("-----------------------");
                    System.out.println("아직 입력된 정보가 없습니다.");
                    System.out.println("-----------------------");

                }

            } else if (userChoice == 3) {
            
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }

        scanner.close();
    }
    
   public static void result(double bmi) {
       String result;
       
       if (bmi < BMI_STANDARD_I) {
           result = "저체중";
       } else if (bmi < BMI_STANDARD_II) {
           result = "정상체중";
       } else if (bmi < BMI_STANDARD_III) {
           result = "과체중";
       } else {
           result = "비만";
       }
       
       System.out.printf("BMI: [%.3f] 비만도: [%s]\n", bmi, result);

       System.out.println("-----------------------");
   }
    
}