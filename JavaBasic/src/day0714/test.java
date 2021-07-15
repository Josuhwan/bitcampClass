package day0714;

import java.util.Random;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {    
        final int NUMBER_MIN = 1;
        final int NUMBER_MAX = 100;
        final int SIZE = 10;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] scoreArray = new int[SIZE];
        int index = 0;

        while (true) {
            System.out.println("1. 플레이 2. 최고기록 보기 3. 종료");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {     
                int currentScore = 0;
                int computerNumber = random.nextInt(NUMBER_MAX) + 1;
                System.out.println("computer 숫자: " + computerNumber);

                int userNumber = 0;
                while (userNumber != computerNumber) {
                  
                    System.out.println("1~100 사이의 숫자를 입력해주세요.");
                    System.out.print("> ");
                    userNumber = scanner.nextInt();
 
                    while (!(userNumber >= NUMBER_MIN && userNumber <= NUMBER_MAX)) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.println("1~100 사이의 숫자를 입력해주세요.");
                        System.out.print("> ");
                        userNumber = scanner.nextInt();
                    }

                    currentScore++;

                    if (userNumber < computerNumber) {
                        System.out.println("!!! UP !!!");
                    } else if (userNumber > computerNumber) {
                        System.out.println("!!! DOWN !!!");
                    }
                }

                if (index < SIZE) {
                    scoreArray[index] = currentScore;
                } else {
                    int newIndex = -1;
                    for (int i = 0; i < scoreArray.length; i++) {
                        if (scoreArray[i] > currentScore) {
                            newIndex = i;
                            break;
                        }
                    }
                    if (newIndex != -1) {
                        for (int i = scoreArray.length - 2; i >= newIndex ; i--) {
                            scoreArray[i + 1] = scoreArray[i];
                        }
                        scoreArray[newIndex] = currentScore;
                    }
                }
                index++;
                int maxIndex = 0;
                if (index < scoreArray.length) {
                    maxIndex = index;
                } else {
                    maxIndex = scoreArray.length;
                }
                for (int i = 0; i < maxIndex - 1; i++) {
                    if (scoreArray[i] > scoreArray[i + 1]) {
                        int temp = scoreArray[i];
                        scoreArray[i + 1] = scoreArray[i + 1];
                        scoreArray[i + 1] = temp;
                        i = -1;
                    }
                }
                System.out.println();
                System.out.printf("사용자의 이번 라운드 점수: [%3d]회\n", currentScore);
                System.out.println();
            } else if (userChoice == 2) {
                if (index == 0) {
                    System.out.println();
                    System.out.println("------------------------------");
                    System.out.println("아직 플레이 기록이 없습니다.");
                    System.out.println("------------------------------");
                    System.out.println();
                } else {
                    int printMax = 0;
                    if (index < SIZE) {
                        printMax = index;
                    } else {
                        printMax = SIZE;
                    }
                    for (int i = 0; i < printMax; i++) {
                        System.out.printf("%d등. [%d]회\n", i + 1, scoreArray[i]);
                    }
                }
            } else if (userChoice == 3) {            
                System.out.println("플레이해주셔서 감사합니다.");
                break;
            }
        }
        scanner.close();
    }
}
