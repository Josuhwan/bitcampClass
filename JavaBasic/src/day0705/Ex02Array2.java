package day0705;
//사용자로부터 숫자 5개를 입력받아서
//차례대로 출력하는 프로그램을 작성하시오
import java.util.Scanner;

public class Ex02Array2 {
	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d번 칸의 값을 입력하세요: ",i+1);
			arr[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]: %d\n", i, arr[i]);
		}
		
		scanner.close();
	}
}