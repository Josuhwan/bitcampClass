package day0701;
//가위 바위 보 게임

//1. 플레이 2. 현재 기록 보기 3. 종료
//> 2
//아직 플레이 기록이 없습니다.
//1. 플레이 2. 현재 기록 보기 3. 종료
//> 1
//1. 가위 2. 바위 3. 보
//> 0
//잘못 입력하셨습니다.
//1. 가위 2. 바위 3. 보
//> 819
//잘못 입력하셨습니다.
//1. 가위 2. 바위 3. 보
//> 2
//사용자의 선택: 바위
//컴퓨터의 선택: 가위
//사용자 승!!
//1. 플레이 2. 현재 기록 보기 3. 종료
//> 1
//1. 가위 2. 바위 3. 보
//> 1
//사용자의 선택: 가위
//컴퓨터의 선택: 바위
//사용자 패!!
//1. 플레이 2. 현재 기록 보기 3. 종료
//> 2
//현재 전적: 1승 0무 1패 (승률: 50%)
//1. 플레이 2. 현재 기록 보기 3. 종료
//> 3
//플레이 해주셔서 감사합니다

    import java.util.Random;
    import java.util.Scanner;

import com.sun.net.httpserver.Authenticator.Result;

    public class Ex_RSP {
        public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            


final int OPTION1 = 1;
final int OPTION2 = 2;
final int OPTION3 = 3;        

int userChoice = 0;
//int userNumber = 0;
boolean inputSwitch = false;

int win = 0;
int draw = 0;
int lose = 0;


       

while (true) {
    System.out.println("1. 플레이 2. 현재 기록 보기 3. 종료");
    userChoice = scanner.nextInt();
    
    int computerChoice = random.nextInt(OPTION3)+1;
    

    if (userChoice == OPTION1) {
        System.out.println("1.가위 2.바위 3.보");
        System.out.println("> ");
        userChoice = scanner.nextInt();
        computerChoice = random.nextInt(OPTION3)+1;
        
        while(!(userChoice >= OPTION1 && userChoice <= OPTION3)) {
            System.out.println("잘못입력하셨습니다");
            System.out.println("1.가위 2.바위 3.보");
            System.out.println("> ");                    
            userChoice = scanner.nextInt();
            
        }
        if(userChoice == OPTION1) {
            System.out.println("사용자의 선택: 가위");
        } else if(userChoice == OPTION2) {
            System.out.println("사용자의 선택: 바위");
        } else if(userChoice == OPTION3) {
            System.out.println("사용자의 선택: 보");
        }
        if(computerChoice == OPTION1) {
            System.out.println("컴퓨터의 선택: 가위");
        } else if(computerChoice == OPTION2) {
            System.out.println("컴퓨터의 선택: 바위");
        } else if(computerChoice == OPTION3) {
            System.out.println("컴퓨터의 선택: 보");
        }
        if(userChoice == OPTION1) {
            if(computerChoice == OPTION1) {
                System.out.println("비겼습니다!");
                draw++;
            } else if(computerChoice == OPTION2) {
                System.out.println("사용자 패!");
                lose++;
            } else if(computerChoice == OPTION3) {
                System.out.println("사용자 승!");
                win++;
            }
            
        }else if(userChoice == OPTION2) {
            if(computerChoice == OPTION1) {
                System.out.println("사용자 승!");
                win++;
            } else if(computerChoice == OPTION2) {
                System.out.println("비겼습니다!");
                draw++;
            } else if(computerChoice == OPTION3) {
                System.out.println("사용자 패!");
                lose++;
            }
            
            System.out.println(result);
            //2.아예 승리가 나오는경우
            //패배가 나오는 경우를 조건식으로 만든다.
            if((userChoice == OPTION1 && computerChoice == OPTION2)
               (userChoice == OPTION2 && computerChoice == OPTION3)
               (userChoice == OPTION3 && computerChoice == OPTION1)) {
               //사용자가 가위를 고르고 컴퓨터가 바위를 골랐거 '나'
                //사용자가 바위를 고르고 컴퓨터가 보를 골랐거'나'
                //사용자가 보를 고르고 컴퓨터가 가위를 골랐을떄
                Result +="패";
                loss++;
                }else { 
                    Result 
                }
            
        }else if(userChoice == OPTION3) {
            if(computerChoice == OPTION1) {
                System.out.println("사용자 패!");
                lose++;
            } else if(computerChoice == OPTION2) {
                System.out.println("사용자 승!");
                win++;
            } else if(computerChoice == OPTION3) {
                System.out.println("비겼습니다!");
                draw++;
            }              
        }   
        
        inputSwitch = true;
        

    } else if (userChoice == OPTION2) {
        
     // 현재 전적: 1승 0무 1패 (승률: 50%)
        if(inputSwitch) {
            int sum = win + lose + draw;
        double winRate = (double)win / sum * 100;
            System.out.printf("현재 전적: %d승 %d무 %d패 (승률: %.2f%%)\n", win, draw, lose, winRate);
        } else {

            System.out.println("아직 입력된 정보가 없습니다.");

        }
        

    } else if (userChoice == OPTION3) {
        System.out.println("플레이 해주셔서 감사합니다");
        break;
    }

}

scanner.close();

}

}