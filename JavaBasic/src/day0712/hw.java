package day0712;
//숙제: 사원관리 프로그램을 클래스를 사용하여 만드시오
//사원은 
//사원 번호, 사원 이름, 사원 부서, 사원 직급, 사원 연봉의 정보가 들어갑니다.
import type.Employee;
import java.util.Scanner;
import util.ScannerUtil;
import java.util.ArrayList;
public class hw {
	
	// 상수
	static final int SALARY_MINX = 200;
	static final int SALARY_MAX = 10000000;
	// 변수
	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Employee> list = new ArrayList<>();
	private static int nextId = 1;
	
	// 객체에 값을 넣어서 list에 추가하는
	// insert()
	private static void insert() {	
	
		// 정보를 담을 객체
		Employee e = new Employee();
		
		// 입력시 출력 메시지를 담을 String 객체
		String message;
		
		// 정보입력
		e.setEmpNumber(nextId++);
		
		message = new String("사원의 이름을 입력해주세요");
		e.setEmpName(ScannerUtil.nextLine(scanner, message));
		
		message = new String("사원의 부서를 입력해주세요");
		e.setEmpDepartment(ScannerUtil.nextLine(scanner, message));
		
		message = new String("사원의 직급을 입력해주세요");
		e.setEmpRank(ScannerUtil.nextLine(scanner, message));
		
		message = new String("사원의 월급을 입력해주세요");
		e.setEmpSalary(ScannerUtil.nextInt(scanner, message));
			
		// 정보가 담긴 객체를 list에 추가
		list.add(e);
		
	}
	
	// 목록을 출력하는
	// printAll()
	private static void printAll() {
	// 비어있으면 - 멘트
		if(list.isEmpty()) {
			System.out.println("입력된 정보가 없습니다.");
			System.out.println("-----------------------");
	// else // for문으로 리스트 뿌려주기
		} else {
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getEmpNumber() + "번 사원: " + list.get(i).getEmpName());
			}
			// 상세멘트 
			// 입력받아서 정보출력 or 뒤로가기	
			String message = new String("상세보기할 사원이 번호나 뒤로 가실려면 0을 입력해주세요");
			int userChoice = ScannerUtil.nextInt(scanner, message, 0, list.size()) -1;
		
			if(userChoice != -1) {
		
				printOne(userChoice);
				
			}
		}
	}	
		
	// 개별 사원 정보를 출력하는
	// printOne
	private static void printOne(int index) {
		// printInfo	
		list.get(index).printInfo();		
		// 수정 삭제 뒤로가기
		// 업데이트 딜리트 프린트올
		String message = new String("1. 수정 2. 삭제 3.뒤로가기");
		int userChoice = ScannerUtil.nextInt(scanner, message);
		if(userChoice == 1) {
			update(index);
		} else if(userChoice == 2) {
			delete(index);
		} else if(userChoice == 3) {
			printAll();
		}
	}

	// 사원 정보를 수정하는
	// update()
	private static void update(int index) {
		// 새로운 정보 부여
		String message;
		message = new String("사원의 이름을 수정해주세요");
		list.get(index).setEmpName(ScannerUtil.nextLine(scanner, message));
		
		message = new String("사원의 부서를 수정해주세요");
		list.get(index).setEmpDepartment(ScannerUtil.nextLine(scanner, message));
		
		message = new String("사원의 직급을 수정해주세요");
		list.get(index).setEmpRank(ScannerUtil.nextLine(scanner, message));
		
		message = new String("사원의 월급을 수정해주세요");
		list.get(index).setEmpSalary(ScannerUtil.nextInt(scanner, message));
		
		// 프린트원	
		printOne(index);
	}
	
	// 사원 정보를 삭제하는
	// delete()
	private static void delete(int index) {
		// 삭제멘트
		// if문 삭제 else printOne
		String message = new String("해당 학생을 정말로 삭제하시겠습니까? y/n");
		String yesNo = ScannerUtil.nextLine(scanner, message);
	
		// 대소문 상관없이 equalsIgnoreCase
		if(yesNo.equalsIgnoreCase("y")) {
			list.remove(index);
			printAll();
		} else {
			printOne(index);
		}
	}
	
	// 메뉴를 담당하는
	// showMenu()
	private static void showMenu() {
	// while / if choice 입력 출력 종료
		while(true) {
			int userChoice = ScannerUtil.nextInt(scanner, "1. 입력 2. 출력 3. 종료");
			if(userChoice == 1) {
				insert();
				
			} else if(userChoice == 2) {
				printAll();
	
			} else if(userChoice == 3) {
				System.out.println("종료하겠습니다");
				break;
			}
		}
	}	
	
	//메인 메소드
	public static void main(String[] args) {
	// 쇼메뉴 
		showMenu();
	}

}
