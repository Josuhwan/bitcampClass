package day0701;

import java.util.Scanner;

public class EmployeeBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		int number = 0;
		String name = "";
		String rank = "";
		String department = "";
		int salary = 0;
		boolean inputSwitch = false;
		
		
		while(true) {
			System.out.print("입력, 출력, 종료 : ");
			String userChoice = scanner.nextLine();
				
			if(userChoice.equals("입력")) {
				
				System.out.print("번호: ");
				number = scanner.nextInt();
				
				System.out.print("이름: ");
				scanner.nextLine();
				name = scanner.nextLine();
				
				System.out.print("직급: ");
				rank = scanner.nextLine();
				
				System.out.print("부서: ");
				department = scanner.nextLine();
				
				System.out.print("월급: ");
				salary = scanner.nextInt();
				
				scanner.nextLine();
				
				inputSwitch = true;
				
			} else if(userChoice.equals("출력")) {
				
				if(inputSwitch) {
					
					System.out.print("사원 번호: "+ number);
					System.out.println("사원 이름: "+ name);
					System.out.print("사원 직급: "+ rank);
					System.out.print("사원 부서: "+ department);
					System.out.print("사원 월급: "+ salary);
					
				} else {
					System.out.println("아직 입력된 정보가 없습니다.");
				}
				
			} else if(userChoice.equals("종료")) {
				System.out.println("종료하겠습니다");
				break;
			} else
				System.out.println("다시 입력해주세요");
		}
		
		
		scanner.close();
	}
}
