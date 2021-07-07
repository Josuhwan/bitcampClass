package day0707;
// 게시판 프로그램을 작성하시오.
// 게시글에는 번호, 제목, 작성자, 내용의 정보가 들어가야 하고
// 이 프로그램은 총 5개의 게시글을 관리할 수 있습니다.
import java.util.Scanner;
import util.ScannerUtil;
public class Board01 {

	// 상수
	// 과목 수
	static final int MENU_SIZE = 3;
	// 글 수
	static final int POST_SIZE = 5;
	// 제목 인덱스
	static final int INDEX_TITLE = 0;
	// 작성자 인덱스
	static final int INDEX_WRITER = 1;
	// 내용 인덱스
	static final int INDEX_CONTENTS = 2;
	
	public static void main(String[] args) {
		// 변수
		// Scanner 변수
		Scanner scanner = new Scanner(System.in);
		// 번호 배열
		int[] idArray = new int[POST_SIZE];
		// 점수 배열
		String[][] scoreArray = new String[POST_SIZE][MENU_SIZE];
		// 다음에 추가할 index
		int index = 0;
		// 각종 입력시 출력할 안내 문구를 저장할 String 변수
		String message;
		
		while(true) {
			message = "1. 입력 2. 출력 3. 종료";
			int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
			
			if(userChoice == 1) {
				if(index < POST_SIZE) {
					// 입력 코드 구현
					// 번호 입력
					message = "번호를 입력해주세요.";
					idArray[index] = ScannerUtil.nextInt(scanner, message);

					// 국어 점수 입력
					message = "제목을 입력해주세요.";
					scoreArray[index][INDEX_TITLE] = ScannerUtil.nextLine(scanner, message);

					// 영어 점수 입력
					message = "작성자를 입력해주세요.";
					scoreArray[index][INDEX_WRITER] = ScannerUtil.nextLine(scanner, message);

					// 수학 점수 입력
					message = "내용를 입력해주세요.";
					scoreArray[index][INDEX_CONTENTS] = ScannerUtil.nextLine(scanner, message);
					// index 1증가
					index++;
				} else {
					System.out.println("더이상 입력하실 수 없습니다.");
				}
				
			} else if(userChoice == 2) {
				// 출력 코드 구현
				if(index > 0) {
					for(int i = 0; i < index; i++) {
						System.out.println();
						System.out.println("-----------------");
						System.out.printf("%d번째 글 정보\n", i+1);
						System.out.println("-----------------");
						System.out.printf("번호: %03d번\n", idArray[i]);
						System.out.println("제목: " + scoreArray[i][INDEX_TITLE]);
						System.out.println("작성자: " + scoreArray[i][INDEX_WRITER]);
						System.out.println("내용: " +scoreArray[i][INDEX_CONTENTS]);
						System.out.println("-------------------------------------");
						
					}
				} else {
					System.out.println("아직 입력된 학생이 존재하지 않습니다.");
				}
			} else if(userChoice == 3) {
				// 종료 코드 구현
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
			
		}
		
		
		
		
	}
}
