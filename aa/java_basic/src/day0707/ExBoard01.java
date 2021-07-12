package day0707;
//게시판 프로그램을 작성하시오 
//게시글에는 번호,제목,작성자,내용의 정보가 들어가야하고 
//이 프로그램은 총5개의 게시글을 관리할 수 있습니다.

import util.ScannerUtil;
import java.util.Scanner;
public class ExBoard01 {
        static final int BOARD_SIZE = 5;
        static final int POST_SIZE = 4;
        static final int INDEX_TITLE = 0;
        static final int INDEX_WRITER = 1;
        static final int INDEX_CONTENT = 2;
        
    public static void main(String[]agrs) {
        Scanner scanner = new Scanner(System.in);
        int[] id = new int[BOARD_SIZE];
        String[] title = new String[BOARD_SIZE];
        String[] writer = new String[BOARD_SIZE];
        String[] content = new String[BOARD_SIZE];
        int index = 0;
        String[][] boardArray = new String[BOARD_SIZE][POST_SIZE];
        
        String message;
        while(true) {
            message = "1.게시판 글쓰기 2.게시글 보기 3.종료";
            int userChoice = ScannerUtil.nextInt(scanner, message);
            
            if(userChoice == 1) {
                //입력
                if(index<BOARD_SIZE) {
                //번호
                   message = "게시글 번호를 입력하세요";
                   id[index] = ScannerUtil.nextInt(scanner,message);
                //제목
                   message = "게시글 제목을 입력하세요";
                  boardArray[index][INDEX_TITLE] = ScannerUtil.nextLine(scanner, message);
                //작성자
                   message ="게시글 작성자를 입력하세요";
                   boardArray[index][INDEX_WRITER] = ScannerUtil.nextLine(scanner, message);
                //내용
                   message = "게시될 내용을 입력하세요";
                   boardArray[index][INDEX_CONTENT] = ScannerUtil.nextLine(scanner, message);
                //다음 입력할 인덱스 1증가
                   index++;
            }
                else {
                    System.out.println("5개의 게시물을 다 쓰셨습니다.");
                }
            }else if(userChoice == 2) {
                //출력가능
                if(index>0) {
                    printAll(int index, int[])
                    
                }
                else {
                    //출력불가능
                    System.out.println("게시글이 없습니다");
                    System.out.println("게시글을 입력하여 주세요");
                        }
                    }
                }
            }else {
                System.out.println("프로그램을 종료합니다.\n 사용해주셔서 감사합니다");
                break;
            }
            
                    
        }
        
    }
}
