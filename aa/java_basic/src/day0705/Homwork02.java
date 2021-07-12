package day0705;
//숙제2. 숫자 맞추기 게임에서 점수를 총 5개까지 보관하고

//점수는 자동으로 오름차순 정렬해서 보여주게 만들어주는 프로그램

import java.util.Random;
import java.util.Scanner;

public class Homwork02 {
    public static void main(String[] args) {

        // 상수
        final int NUMBER_MAX = 100;
        final int NUMBER_MIN = 1;
        final int SIZE = 5;

        // 변수
        // Scanner 클래스 변수
        Scanner scanner = new Scanner(System.in);
        // Random 클래스 변수
        Random random = new Random();
        // 점수배열
        int[] scoreArray = new int[SIZE];
        // 점수배열의 다음 입력할 인덱스
        int index = 0;

        while (true) {
            System.out.println("1.플레이 2.최고기록 3.종료");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                // 플레이 코드 구현

                // 이번 라운드 점수를 저장할 변수
                int currentScore = 0;
                // 컴퓨터 숫자 뽑는다
                int computerNumber = random.nextInt(NUMBER_MAX) + 1;
                System.out.println("computer 숫자:"+ computerNumber);
                // 사용자가 입력할 숫자를 저장할 변수
                int userNumber = 0;

                // 사용자가 컴퓨터 숫자와 다른 숫자를 입력하는 동안
                // 계속 입력을 받는다.맞출때까지 반복
                while (userNumber != computerNumber) {
                    // 사용자로부터 숫자를 하나 입력을 받는다.
                    System.out.println("1~100사이의 숫자를 입력해 주세요.");
                    System.out.println(">");
                    userNumber = scanner.nextInt();
                    // 사용자가 입력한 숫자가 유효한지 체크한다.
                    while (!(userNumber >= NUMBER_MIN && userNumber <= NUMBER_MAX)) {
                        System.out.println("잘못입력하셨습니다.");
                        System.out.println("1~100사이의 숫자를 입력해 주세요");
                        System.out.println(">");
                        userNumber = scanner.nextInt();
                    }
                    // 현재점수를 1증가시킨다
                    currentScore++;

                    // 사용자가 입력한 숫자가 컴퓨터의 숫자보다 크거나 작으면
                    // UP혹은 DOWN을 출력해준다.
                    if (userNumber < computerNumber) {
                        System.out.println("!!UP!!");
                    } else if (userNumber > computerNumber) {
                        System.out.println("!!DOWN!!");
                    }
                }

                // 사용자의 점수를 점수 배열에 추가해야 '할'경우 추가한다.
                // 이때에는 index의 값이 5미만일 경우와
                // 그 외의 경우 2가지경우에서 생각해 봐야한다.
                if (index < SIZE) {
                    // 입력된 점수가 5개 미만이기때문에 현재점수를 배열에 넣어준다.
                    scoreArray[index] = currentScore;
                } else {
                    // 점수배열에서 현재 점수가 들어갈 위치를 찾는다.
                    // -> 각배열의 값과 현재 점수를 비교해서
                    // 만약 해당 인덱스의 값이 현재점수보다 크면
                    // 그 인덱스가 현재점수가 들어갈 새로운 위치가 된다.

                    // 새로운 점수가 들어갈 위치
                    int newIndex = -1;// 새로운 점수가 들어갈곳이 없을때를 대비해 -1로 초기화.
                                      // 들어갈 곳이 없을때는 들어갈수없게 만든다.
                    // 새로운 점수가 들어갈 위치를 찾는다
                    for (int i = 0; i < scoreArray.length; i++) {
                        if (scoreArray[i] > currentScore) {
                            newIndex = i;
                            break;//어차피 배열은 지금 정렬이 되어있기때문에 하나만 찾으면 
                                //더이상 찾지 않아도 된다.그래서 멈춤.
                        }
                    }
                    // 그 위치가 유효하면
                    // 해당 위치에 있던 점수부터 끝-1까지
                    // 1칸씩 뒤로 민다.
                    if (newIndex != -1) {
                        // 점수배열에 들어갈 칸을 찾았으므로
                        // newIndex부터 한칸씩 뒤로 민다.
                        for (int i =scoreArray.length-2; i <newIndex; i--) {
                            scoreArray[i + 1] = scoreArray[i];
                          // scoreArray[i]배열의 맨뒤의 값은 없어진다.
                        }
                    }
                    // 해당 위치에 현재 점수를 넣는다.
                    scoreArray[newIndex] = currentScore;
                }
                index++;
                
                DFD
                //index의 현재값에 따라서 
                //index-1까지 정렬을 할지 
                //아니면 배열 전체를 정렬을 할지 정해준다.
                int maxIndex = 0;
                if(index<scoreArray.length) {
                    maxIndex = index;
                }else {
                    maxIndex = scoreArray.length;
                }
                // 배열을 오름차순 정렬하되
                // 점수가 들어가지 않은 칸은 정렬에서 제외한다.
                for (int i = 0; i < maxIndex-1; i++) {
                    if (scoreArray[i] > scoreArray[i + 1]) {
                        int temp = scoreArray[i];
                        scoreArray[i] = scoreArray[i + 1];
                        scoreArray[i + 1] = temp;
                        i = -1;//다시 i가 0으로 돌아가서 정렬검사
                    }
                }
                System.out.println();
                System.out.printf("사용자의 이번 라운드 점수: [%3d]회\n",currentScore);
                System.out.println();
                
            } else if (userChoice == 2) {
                // 최고기록 보기 코드 구현
                // index가 0일경우->경고메세지만 출력
                if (index == 0) {
                    System.out.println("=================");
                    System.out.println("아직 플레이 기록이 없습니다.");
                    System.out.println("==================");
                    System.out.println();
                }
                // index가 size보다 작을 경우->0~index-1 까지 출력
                else {
                    // index의 현재 값에 따라서
                    // index-1가지 출력할지 혹은
                    // SIZE까지 출력할지 결정한다.
                    // 즉, for문의 조건식에 들어갈 변수를 만들어서
                    // index로 초기화 하냐 혹은 SIZE로 초기화 하냐만 정해주면
                    // 우리가 for문 하나로
                    // 2가지 경우를 출력해줄 수 있게 된다.

                    int printMax;
                    if (index < SIZE) {
                        // 점수가 아직 5개 미만으로 입력됐을 경우
                        printMax = index;
                    } else {
                        // 점수가 5개 이상 입력됐을경우
                        printMax = SIZE;
                    }
                    for (int i = 0; i < printMax; i++) {
                        System.out.printf("%d등.[%d]회\n", i + 1, scoreArray[i]);
                    }

                }
            } else if (userChoice == 3) {
                // 종료코드 구현
                System.out.println("플레이 해주셔서 감사합니다.");
                break;
            }
        }

        // scanner 변수 닫아주기
        scanner.close();
    }
}
