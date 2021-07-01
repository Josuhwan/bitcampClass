package day0701;

import java.util.Random;
import java.util.Scanner;

// 가위 바위 보 게임
// 1. 플레이 2. 현재 기록 보기 3. 종료
// > 2
// 아직 플레이 기록이 없습니다.
// 1. 플레이 2. 현재 기록 보기 3. 종료
// > 1
// 1. 가위 2. 바위 3. 보
// > 0
// 잘못 입력하셨습니다.
// 1. 가위 2. 바위 3. 보
// > 819
// 잘못 입력하셨습니다.
// 1. 가위 2. 바위 3. 보
// > 2
// 사용자의 선택: 바위
// 컴퓨터의 선택: 가위
// 사용자 승!!
// 1. 플레이 2. 현재 기록 보기 3. 종료
// > 1
// 1. 가위 2. 바위 3. 보
// > 1
// 사용자의 선택: 가위
// 컴퓨터의 선택: 바위
// 사용자 패!!
// 1. 플레이 2. 현재 기록 보기 3. 종료
// > 2
// 현재 전적: 1승 0무 1패 (승률: 50%)
// 1. 플레이 2. 현재 기록 보기 3. 종료
// > 3
// 플레이 해주셔서 감사합니다
public class RSP {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		boolean inputSwitch = false;
		double p;
		
			while(true) {
				System.out.print("1. 플레이, 2. 현재 기록 보기, 3. 종료 : ");
				int userChoice = scanner.nextInt();
					
				if(userChoice == 1) {
					inputSwitch = true;
					System.out.println("1. 가위 2. 바위 3. 보");
					int computer = random.nextInt(3)+1;
					System.out.print("사용자: ");
					int play = scanner.nextInt();
					int result = play - computer;
					
					while (!(play >= 1 && play <= 3)) {
						System.out.println("잘못 입력하셨습니다.");
						System.out.print("사용자: ");
						play = scanner.nextInt();
					}
					
					if(computer == play) { 
						System.out.println("무승부입니다");
						System.out.println("=======================");
						draw++;
					} else if(result == 1 || result == -2) {
						System.out.println("사용자 승리!!");
						System.out.println("=======================");
						win++;
					} else {
						System.out.println("사용자 패배!!");
						System.out.println("=======================");
						lose++;
					}
						
				} else if(userChoice == 2) {
					if(inputSwitch == true) {
						System.out.print("현재 나의 전적: "+ win +"승 "+ draw +"무 "+ lose +"패");
						System.out.println("(승률: "+((double)win/((double)win+lose))*100 + "%)" );
					} else {
						System.out.println("아직 플레이 기록이 없습니다.");
					}
				} else if(userChoice == 3) {
					System.out.println("플레이 해주셔서 감사합니다");
					break;
				} else
					System.out.println("다시 입력해주세요");
			}
		
		
			scanner.close();
		}
}