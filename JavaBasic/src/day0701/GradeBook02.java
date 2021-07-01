package day0701;
//성적출력 프로그램
//단, 무한루프를 적용시켜서
//입력과 출력을 분리하여
//사용자가 입력을 누를 때에만 입력만 실행이 되고
//출력을 누를 때에만 기존에 저장된 정보를 토대로 해서 출력이 되게
//코드를 작성한다.
//또한 사용자가 1~10을 벗어난 번호나 잘못된 점수를 입력하면
//올바른 값이 들어올때까지 다시 입력을 받는다.

//힌트: 변수의 유효범위를 잘 생각해보자

//심화과정: 만약 사용자가 아무런 정보 입력도 안한 상태에서
//      출력을 누르면 "아직 입력된 정보가 존재하지 않습니다" 가
//      출력이 되게 코드를 작성하시오.
import java.util.Scanner;

public class GradeBook02 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final int ID_MIN = 1;
		final int ID_MAX = 10;
		final int SCORE_MIN = 0;
		final int SCORE_MAX = 100;
		final int SUBJECT_SIZE = 3;
		
		int id = 0;
		String name = "";
		int korean = 0;
		int english = 0;
		int math = 0;
		int sum = korean + english + math;
		double average = (double) sum / 3;;
		

		while (true) {
			System.out.println("1. 입력 2. 출력 3. 종료");
			int userChoice = scanner.nextInt();

			if (userChoice == 1) {
				System.out.print("입력 시작");
				int input;
				String message;
				
				message = "번호를 입력해주세요.";
				System.out.println(message);
				System.out.print("> ");
				input = scanner.nextInt();

				while (!(input >= ID_MIN && input <= ID_MAX)) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println(message);
					System.out.print("> ");

					input = scanner.nextInt();
				}

				message = "이름을 입력해주세요.";
				System.out.println(message);
				System.out.print("> ");
				scanner.nextLine();

				message = "국어 점수를 입력해주세요.";

				System.out.println(message);
				System.out.print("> ");
				input = scanner.nextInt();

				while (!(input >= SCORE_MIN && input <= SCORE_MAX)) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println(message);
					System.out.print("> ");
					input = scanner.nextInt();
				}

				message = "영어 점수를 입력해주세요.";

				System.out.println(message);
				System.out.print("> ");
				input = scanner.nextInt();

				while (!(input >= SCORE_MIN && input <= SCORE_MAX)) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println(message);
					System.out.print("> ");
					input = scanner.nextInt();
				}

				message = "수학 점수를 입력해주세요.";

				System.out.println(message);
				System.out.print("> ");
				input = scanner.nextInt();

				while (!(input >= SCORE_MIN && input <= SCORE_MAX)) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println(message);
					System.out.print("> ");
					input = scanner.nextInt();

				}

			} else if (userChoice == 2) {

				System.out.println("출력 시작");
				System.out.println("===========================================");
				System.out.printf("번호: %03d번 이름: %s\n", id, name);
				System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
				System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
				System.out.println("===========================================");
			} else if (userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}

		}
		scanner.close();

	}

}
