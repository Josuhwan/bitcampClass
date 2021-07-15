package day0714;

import java.util.Scanner;

public class exam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		//문항1번
		 int[] arr = new int[5];
		 int result = 1; 
		     
		 for(int i = 0; i < arr.length; i++) { 
		      
			 result = result * 2; 
		      System.out.println(result);
		 } 		     
		 System.out.println("----------------------");
		 
		 //문항2번
		 System.out.println("숫자 입력하세요: ");
		 
		 int number1 = scanner.nextInt();

		 String number = String.valueOf(number1);

	     char[] digits1 = number.toCharArray();

	     for(int i = 0; i < digits1.length; i++) {
	          System.out.println(digits1[i]);
	        }
	    
 
	}
}
