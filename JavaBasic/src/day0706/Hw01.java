package day0706;

import java.util.Scanner;

//숙제 1. 5명의 키와 몸무게를 토대로 해서 bmi결과를 입력한 사람까지만 출력하는 프로그램
public class Hw01 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 final int USER_SIZE = 5;

		 
		 int[] idArray = new int[USER_SIZE];
		 String[] nameArray = new String[USER_SIZE];
		 double[] heightArray = new double[USER_SIZE];
		 double[] weightArray = new double[USER_SIZE];
		 
		 int index = 0;
		 
		 while (true) {
	            System.out.println("1. 입력 2. 출력 3. 종료");
	            System.out.print("> ");
	            int userChoice = scanner.nextInt();
	            if (userChoice == 1) {
	                if (index < USER_SIZE) {              
	                    System.out.println("번호를 입력해주세요.");
	                    System.out.print("> ");
	                    idArray[index] = scanner.nextInt();

	                    System.out.println("이름을 입력해주세요.");
	                    System.out.print("> ");
	                    scanner.nextLine();
	                    nameArray[index] = scanner.nextLine();

	                    double height;

	                    System.out.println("키를 입력해주세요.");
	                    System.out.print("> ");
	                    height = scanner.nextDouble();
	                    while (!(height >= 0 && height <= 2.72)) {
	                        System.out.println("잘못입력하셨습니다.");
	                        System.out.println("키를 입력해주세요.");
	                        System.out.print("> ");
	                        height = scanner.nextDouble();
	                    }

	                   heightArray[index] = height;
	                   
	                   double weight;
	                    System.out.println("몸무게를 입력해주세요.");
	                    System.out.print("> ");
	                    weight = scanner.nextInt();
	                    while (!(weight >= 0 && weight <= 658)) {
	                        System.out.println("잘못입력하셨습니다.");
	                        System.out.println("몸무게를 입력해주세요.");
	                        System.out.print("> ");
	                        weight = scanner.nextDouble();
	                    }

	                    weightArray[index] = weight;
       
	                    index++;

	                } else {
	                 
	                    System.out.println("이미 5명의 정보를 입력했습니다.");
	                }

	            } else if (userChoice == 2) {
	             
	                if (index == 0) {
	                   
	                    System.out.println("아직 한명도 입력되지 않았습니다.");
	                } else {
	                   
	                    for (int i = 0; i < index; i++) {
	                      
	                    	double bmi = weightArray[i] / heightArray[i] / heightArray[i];                       
	                     
	                        System.out.printf("번호: %03d번 이름: %s\n", idArray[i], nameArray[i]);
	                        System.out.println("키: " + heightArray[i] + "m" + " 몸무게: " + weightArray[i] +"kg");
	                        System.out.println("bmi: " + bmi);

	                    }
	                }

	            } else if (userChoice == 3) {
	                System.out.println("사용해주셔서 감사합니다.");
	                break;
	            }
	        }

	        scanner.close();
	}
}
