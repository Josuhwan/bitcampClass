package day0706;

import java.util.Scanner;
import util.ScannerUtil;
public class GradeBook01 {
    
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;
    static final int SUBJECT_SIZE = 3;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int id = 0;
        String name = "";
        int korean = 0;
        int english = 0;
        int math = 0;
        boolean inputSwitch = false;
        
        while(true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            if(userChoice == 1) {
                System.out.println("번호를 입력해주세요.");
                System.out.print("> ");
                id = scanner.nextInt();
                
                name = ScannerUtil.nextLine(scanner, "이름");
                
                korean = setScore("국어", scanner);
                
                english = setScore("영어", scanner);
                
                math = setScore("수학", scanner);
                
                inputSwitch = true;
                
            } else if(userChoice == 2) {
                if (inputSwitch) {
                    aprintInfo(id, name, korean, english, math);
                } else {
                    // 점수가 한번도 입력안된 경우
                    System.out.println("아직 입력된 정보가 존재하지 않습니다.");
                }
            } else if(userChoice == 3) {
                System.out.println("종료하겠습니다.");
                break;
            }
        }
       

        scanner.close();
    }
    
    public static void aprintInfo(int id, String name, int korean, int english, int math) {
        int sum = korean + english + math;
        
        double average = (double) sum / SUBJECT_SIZE;
        
        System.out.printf("번호: %03d번 이름: %s\n", id, name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
        System.out.printf("총점: %03d점 평균; %06.2f점\n", sum, average);
    }
  
    public static int setScore(String message, Scanner scanner) {
        int score = 0;
        System.out.println(message);
        System.out.print("> ");
        score = scanner.nextInt();
        
        while( !(score >= SCORE_MIN && score <= SCORE_MAX)) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println(message);
            System.out.print("> ");
            score = scanner.nextInt();
        }
        
        return score;
    }
}
