package day0701;
// 랜덤 숫자 맞추기 게임

// 사용자가 1. 플레이 2. 최고기록 보기 3. 종료
// 중 하나를 입력하면, 각각의 기능이 실행된다.
// 1. 플레이
//    사용자가 플레이를 실행시키면, 컴퓨터는
//    1~100까지의 랜덤한 숫자를 생성한다.
//    그리고 사용자는 그 숫자가 얼마인지 입력해서 맞춰야 하는데
//    사용자가 맞출때까지 입력은 계속 된다.
//    만약 사용자가 입력한 숫자가 컴퓨터의 숫자보다 크면 "DOWN" 이라고 출력된다.
//    만약 사용자가 입력한 숫자가 컴퓨터의 숫자보다 작으면 "UP" 이라고 출력된다.
//    또한, 사용자가 틀릴 때마다 현재 점수가 1점씩 올라가는데
//    최종적으로, 최고기록과 비교해서 현재 점수가 더 작으면
//    현재 점수가 새로운 최고기록이 된다.
//    그리고 사용자가 정답을 맞추면 현재 점수, 최고 기록 그리고 
//    만약 사용자가 최고 기록을 갱신했으면 축하메시지까지 출력이 된다.

// 2. 최고기록 보기
//    현재 최고기록을 보여준다. 
//    단, 만약 사용자가 한번도 플레이 한적이 없으면
//    "아직 플레이 기록이 없습니다!" 만 출력이 된다.

// 3. 종료
//    프로그램을 종료시킨다.

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int score = 0;
		int bestScore = 100;
		boolean inputSwitch = false;
		
			while(true) {
				System.out.print("1. 플레이, 2. 최고기록 보기, 3. 종료 : ");
				int userChoice = scanner.nextInt();
					
				if(userChoice == 1) {
					inputSwitch = true;
					int computer = random.nextInt(101);
					System.out.println("컴터점수: " + computer);
						
						do {
							System.out.print("사용자 입력: ");
							int play = scanner.nextInt();
							
							if(computer == play) {
								if(score < bestScore) {
									bestScore = score;
									System.out.println("==============================");
									System.out.println("정답!!");
									System.out.println("현재점수: "+ score + "점");
									System.out.println("최고점수: "+ bestScore+ "점");
									System.out.println("축하합니다 최고점수 갱신!!");
									System.out.println("==============================");
									score = 0;
								} else {
									System.out.println("==============================");
									System.out.println("정답!!");
									System.out.println("현재점수: "+ score + "점");
									System.out.println("최고점수: "+ bestScore+ "점");
									System.out.println("==============================");
									score = 0;
								}
								break;
							} else if(computer != play) {
								score++;
								if(computer > play) {
									System.out.println("UP");
								} else  {
									System.out.println("DOWN");
								}
							}
							
						} while(true);
					
				} else if(userChoice == 2) {
					if(inputSwitch == true) {
						System.out.println("최고점수: "+ bestScore + "점");
					} else {
						System.out.println("아직 플레이 기록이 없습니다.");
					}
				} else if(userChoice == 3) {
					System.out.println("종료하겠습니다");
					break;
				} else
					System.out.println("다시 입력해주세요");
			}
		
		
			scanner.close();
		}
}
