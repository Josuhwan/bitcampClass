package day0707;
//구구단을 출력하는 프로그램을 작성하시오.
//단, 2차원 배열을 사용하여 
//2~9단의 결과값을 각각의 배열에 먼저 저장하고 
//그 후에 2차원 배열 전체를 출력하는 방식으로 저장하시오

public class Ex_MultiArray {
    public static void main(String[]args) {
        
        //각 단의 결과값을 담을 2차원 배열 선언
        int[][] gugudan = new int[8][9];//9개배열을 8(2단부터 9단까지)개가진 배열
        //각 단의 결과값을 저장하는 for문
        for(int i= 0; i<gugudan.length; i++) {//gugudan.length=8
            //현재 몇단인지를 저장할 int변수
            int dan = i+2;
            for(int j = 0; j<gugudan[i].length; j++) {//gugudan[i].length=>i번째줄이 가진 배열의 index=9
                int multiplier = j+1;
                gugudan[i][j] = dan*multiplier;
            }
        }
        //각 단의 결과값을 출력하는 for믄
        for(int i = 0; i<gugudan.length; i++) {
            System.out.println("====================");
            System.out.printf("%d단\n",i+2);
            System.out.println("====================");
            for(int j = 0;)
           }
       }
    }

