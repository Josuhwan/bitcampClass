package day0707;

//별찍기 1번 5번 10번을 char의 2차원 배열을 사용하여 만드시오
//단, 사용자가 5라고 입력하면 각각 5줄 5줄 9줄이 출력되고 
//각 줄의 칸은 5,9,9 가 됩니다.
//공백은 아무것도 넣지않으면 공백이 나오게 됩니다.
//별찍기 5번
import java.util.Scanner;
import util.ScannerUtil;

public class Ex_StarPrinter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 사용자로부터 출력할 줄 수를 입력받는다.
        String message = "출력할 줄의 갯수를 입력해주세요";
        int lineNumber = ScannerUtil.nextInt(scanner, message);
        // 사용자로부터 입력받은 줄 수에 맞춰서 2차원배열을 만든다.
        // 각 줄의 가로 칸 수
        int totalWidth = lineNumber * 2 - 1;
        char[][] stars = new char[lineNumber][totalWidth];

        // 2차원배열에 각각 알맞는 값들을 입력한다.
        for (int i = 0; i < stars.length; i++) {
            // 공백의 갯수
            int spaceWidth = lineNumber - (i + 1);

            // 별의 갯수
            int starWidth = i * 2 + 1;

            // 공백의 j for문
            // 별의 j for문
            for (int j = spaceWidth; j < spaceWidth + starWidth; j++) {
                // 공백에 아무것도 넣지 않아도 공백이 나오게 하기위해 j범위를 정해준다.
                stars[i][j] = '*';

            }
        }
        // 2차원배열을 출력한다.
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; i++) {
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }

}
