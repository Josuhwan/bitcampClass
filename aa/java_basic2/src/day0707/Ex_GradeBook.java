package day0707;
//5명의 학생을 관리할수 있는 프로그램
//단 국영수점수는 별개의 배열이 아닌 
//1개의 2차원배열로 관리한다.
//각학생의 점수 2차원 배열의 0번 배열은 국어,1번배열은 영어,2번 배열은 수학이 될수있도록 코드를 작성하시오.

import java.util.Scanner;

import util.ScannerUtil;
public class Ex_GradeBook {
    //상수
        static final int STUDENT_SIZE = 5;
        static final int SUBJECT_SIZE = 3;
        static final int SCORE_MIN = 0;
        static final int SCORE_MAX = 100;
        // 국어 점수 인덱스
        static final int INDEX_KOREAN = 0;
        // 영어 점수 인덱스
        static final int INDEX_ENGLISH = 1;
        // 수학 점수 인덱스
        static final int INDEX_MATH = 2;
    public static void main(String[]args) {
        //변수
        Scanner scanner = new Scanner(System.in);
        String[] nameArray = new String[STUDENT_SIZE];
        int[] idArray = new int[STUDENT_SIZE];
        int [][] scoreArray = new int[STUDENT_SIZE][SUBJECT_SIZE ];
        int index = 0;
        String message;
        
        
        while(true) {
            message = "1.입력 2.출력 3.종료";
            int userChoice = ScannerUtil.nextInt(scanner,message,1,3);
            
            if(userChoice == 1) {
                //입력
                if(index<STUDENT_SIZE) {
                //번호
                   message = "번호를 입력해주세요";
                          idArray[index] = ScannerUtil.nextInt(scanner, message); 
                //이름
                   message = "이름를 입력해주세요";
                           nameArray[index] = ScannerUtil.nextLine(scanner, message); 
                //국어점수                   
                   message = "국어점수를 입력해주세요";

                //영어점수
                   message = "영어점수를 입력해주세요";
                //수학점수
                  message = "수학점수를 입력해주세요";
                //index 1 증가
                }else {
                    System.out.println("더이상 입력하실 수 없습니다.");
                }
            }else if(userChoice == 2) {
                //출력
                if(index>0) {
                    for(int i = 0; i<index; i++) {
                        System.out.println();
                        System.out.println("===============================");
                        System.out.printf("%d번째 학생 정보\n",i+1);
                        System.out.println("==============================");
                        System.out.printf("번호: %d번 이름: %s\n",);
                        System.out.printf("국어: %03d점 영어: %3d점 수학: %03d점\n",);
                    }
                    
                }else {
                    System.out.println("아직 입력된 학생이 존재하지 않습니다.");
                }
            }else if(userChoice == 3) {
                //종료
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
            
        
        
                
    scanner.close();
}
}