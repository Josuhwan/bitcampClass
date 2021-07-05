package day0705;

import java.util.Random;
import java.util.Scanner;

//숙제 2. 숫자 맞추기 게임에서 점수를 총 5개까지 보관하고
//점수는 자동으로 오름차순 정렬해서 보여주게 만들어주는 프로그램
public class hw2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 Random random = new Random();

	        final int SIZE = 6;
	        final int NUMBER_MIN = 1;
	        final int NUMBER_MAX = 45;

	        int[] userArray = new int[SIZE];
	        int[] computerArray = new int[SIZE];
	        
	        int index = 0;
	        
	        while (index < SIZE) {
	            int number = random.nextInt(NUMBER_MAX) + 1;
	   
	            boolean checkNumber = true;

	            for (int i = 0; i < computerArray.length; i++) {
	                if (number == computerArray[i]) {
	                    checkNumber = false;
	                }
	            }

	            if (checkNumber) {
	                computerArray[index] = number;
	                index++;
	            }
	        }
	        
	        for (int i = 0; i < computerArray.length - 1; i++) {
	            if (computerArray[i] > computerArray[i + 1]) {
	                int temp = computerArray[i];
	                computerArray[i] = computerArray[i + 1];
	                computerArray[i + 1] = temp;
	                i = -1;
	            }
	        }
	        
	        index = 0;
	        while (index < userArray.length) {
                System.out.println("-----------------------------");
                System.out.printf("%d번째 숫자", index + 1);
                System.out.println("1~45 사이의 숫자를 입력해주세요.");

                int number = scanner.nextInt();

                boolean checkNumber = true;
 
                checkNumber = number >= NUMBER_MIN && number <= NUMBER_MAX;

               
                for (int i = 0; i < userArray.length; i++) {
                    if (number == userArray[i]) {
                        checkNumber = false;
                    }
                }
                
                if (checkNumber) {
                    userArray[index] = number;
                    index++;
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                }

                System.out.println("-----------------------------");
            }
        
	    
        for (int i = 0; i < userArray.length - 1; i++) {
            if (userArray[i] > userArray[i + 1]) {
                int temp = userArray[i];
                userArray[i] = userArray[i + 1];
                userArray[i + 1] = temp;
                i = -1;
            }
        }

      
        System.out.println("-----------------------------");
        System.out.println("컴퓨터 숫자");
        System.out.println("-----------------------------");
        for (int i = 0; i < computerArray.length; i++) {
            System.out.printf("[%2d] ", computerArray[i]);
        }
        System.out.println();

        System.out.println("-----------------------------");
        System.out.println("사용자 숫자");
        System.out.println("-----------------------------");
        for (int i = 0; i < userArray.length; i++) {
            System.out.printf("[%2d] ", userArray[i]);
        }
        System.out.println();

       
        int count = 0;

        for (int i = 0; i < computerArray.length; i++) {
            for (int j = 0; j < userArray.length; j++) {
                if (computerArray[i] == userArray[j]) {
                    count++;
                }
            }
        }

        // count를 출력한다.
        System.out.printf("총 맞은 갯수: %d개\n", count);

        scanner.close();
    }
	
}
