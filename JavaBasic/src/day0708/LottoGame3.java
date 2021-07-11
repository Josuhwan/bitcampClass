package day0708;
// 로또게임 3번
// 사용자로부터 자동으로 할지 수동으로 할지
// 입력 받아서
// 6개의 로또 숫자를 뽑아주는 프로그램
// 만약 사용자가 자동을 선택하면
// 자동으로 1-45의 숫자 6개가 나오고
// 수동으로 하면
// 사용자가 1~45의 숫자 6개가 나오도록 프로그램 작성하시오
import java.util.Scanner;
import java.util.Random;
import util.ArrayUtil;
import util.ScannerUtil;
public class LottoGame3 {
		// 상수
		static final int SIZE = 6;
		static final int NUMBER_MIN = 1;
		static final int NUMBER_MAX = 45;
		
		public static void main(String[] args) {
			// 변수 선언
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();
			int[] numbers = new int[0];
			String message;
			
			//  사용자 숫자 결정
	        // 사용자로부터 수동으로 할지 자동으로 할지 입력을 받는다.
			     
	        message = "1. 자동 2. 수동";
	        int userChoice = ScannerUtil.nextInt(scanner, message);

	        // 사용자가 입력한 숫자가 1 혹은 2가 맞는지 확인
	        while (!(userChoice >= 1 && userChoice <= 2)) {
	            System.out.println("잘못 입력하셨습니다.");
	            userChoice = ScannerUtil.nextInt(scanner, message);
	        }
	        //자동
	        if(userChoice == 1) {
	        	while(ArrayUtil.size(numbers) < SIZE) {
	    			int num = random.nextInt(NUMBER_MAX) +1;
	    			if(!(ArrayUtil.contains(numbers, num))) {
	    				numbers = ArrayUtil.add(numbers, num);
	    			}
	    		}
	    		//정렬부분
//	    		for(int i = 0; i < ArrayUtil.size(numbers) - 1; i++) {
//	    			if(ArrayUtil.get(numbers, i) > ArrayUtil.get(numbers, i+1)) {
//	    				int temp = ArrayUtil.set(numbers, i, ArrayUtil.get(numbers, i+1));
//	    				ArrayUtil.set(numbers,  i+1, temp);
//	    				i = -1;
//	    			}
//	    		}
	    		
	    		for(int i = 0; i < ArrayUtil.size(numbers); i++) {
	    			System.out.printf("%d번째 번호: %d\n", i + 1, ArrayUtil.get(numbers, i));   			
	    		}
	    	//수동	
	        } else if(userChoice ==2) {
	        numbers = setNumbers(numbers, scanner);
			sort(numbers);
			print(numbers);
	        }
			
			scanner.close();
		}
		
		public static int[] setNumbers(int[] arr, Scanner scanner) {
			String message = "1~45 사이의 숫자를 입력해주세요.";
			while(ArrayUtil.size(arr) < SIZE) {
				// 1. 사용자로부터 숫자를 입력 받는다.
				System.out.println();
				System.out.println("=============================");
				System.out.printf("[%d]번 숫자\n", ArrayUtil.size(arr) + 1);
				int number = ScannerUtil.nextInt(scanner, message, NUMBER_MIN, NUMBER_MAX);
				System.out.println("=============================");
				System.out.println();
				// 2. 해당 숫자가 배열에 존재하는지 체크한다.
				if(!ArrayUtil.contains(arr, number)) {
					// 3. 만약 존재하지 않는다면 arr에 추가해준다.
					arr = ArrayUtil.add(arr, number);
				} else {
					// 4. 존재하면 경고메시지만 출력해준다.
					System.out.println("중복된 숫자입니다");
				}				
			}		
			return arr;
		}
		
		public static void sort(int[] arr) {
			for(int i = 0; i < ArrayUtil.size(arr) - 1; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					i = -1;		
				}
			}
		}	
		
			public static void print(int[] arr) {
				for(int i = 0; i < ArrayUtil.size(arr); i++) {
					System.out.printf("%d번 숫자: [%2d]\n", i+1, arr[i]);				
					}
			}
	}
