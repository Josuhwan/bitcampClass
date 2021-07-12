package day0707;
//별찍기 1번 5번 10번을 char의 2차원 배열을 사용하여 만드시오
//단, 사용자가 5라고 입력하면 각각 5줄 5줄 9줄이 출력되고 
//각 줄의 칸은 5,9,9 가 됩니다.
//공백은 아무것도 넣지않으면 공백이 나오게 됩니다.
import java.util.Scanner;
//별찍기 10번
import util.ScannerUtil;
public class Ex_StarPrinter3 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        //사용자로부터 출력할 줄 수를 입력받는다.
        String message = "출력할 줄의 갯수를 입력해주세요";
        int lineNumber=ScannerUtil.nextInt(scanner, message);
        //사용자로부터 입력받은 줄 수에 맞춰서 2차원배열을 만든다.
        //총 세로줄수 
        int totalHeight = 2*lineNumber -1;
        //총 가로줄수
        int totalWidth = 2*lineNumber-1;
        //2차원 배열
        char[][] stars  = new char[totalHeight][totalWidth];
        
        //2차원배열에 각각 알맞는 값들을 입력한다.
        for(int i =0; i<stars.length; i++) {
           //첫번째줄과 마지막줄에는 별로 채워준다.
            if(i == 0 || i == stars.length-1) {
                for(int j = 0; j<stars[i].length; j++) {
                 stars[i][j] ='*';
            }
             }else  {
                 //별의 갯수를 저장한다.
                 int starWidth;
                 if(i<lineNumber) {
                     //i가 1부터 시작
                     starWidth = lineNumber-i;
                 }else {
                     //i가 linenumber 부터 여기로 
                     int lowerl = i-lineNumber+2;
                     
                     starWidth = lowerl;
                 }
                 //왼쪽별을 추가하는 j for문
                 for(int j = 0; j<starWidth;j++) {
                     stars[i][j] ='*';
                 }
                 //오른쪽 별을 추가하는 j for문
                 //가장 마지막 칸의 인덱스를 저장할 int변수
                 int lastIndex = stars[i].length-1;
                 for(int j= lastIndex; j>lastIndex-starWidth; j--) {
                 stars[i][j]='*';
                 }
             }
        }
        //2차원배열을 출력한다.
        for(int i = 0; i<stars.length; i++) {
            for(int j= 0; j<stars[i].length; j++) {
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }
        
         
        scanner.close();
             
         }이거다시보자ㅜㅜㅜㅜ
                
    }

