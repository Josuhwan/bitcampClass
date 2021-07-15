package day0714;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		
		System.out.println("입력할숫자 1: ");
		num1 = scanner.nextInt();
		System.out.println("입력할숫자 2: ");
		num2 = scanner.nextInt();
		System.out.println("입력할숫자 3: ");
		num3 = scanner.nextInt();
		
		mul(num3, num3, num3);
	}
	
	public static int mul(int num1, int num2, int num3) {
		int a;
		a = num1 * num2 * num3;
		System.out.println(a);
		return a;
	}
}
