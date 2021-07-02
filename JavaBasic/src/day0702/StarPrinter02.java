package day0702;

import java.util.Scanner;

public class StarPrinter02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("사용자 입력: ");
        System.out.print(">");
        int user = scanner.nextInt();
        
        for(int i = 1; i <= user; i++) {
            for( int j = i; j <= user; j++) {
                
                System.out.print("*");
            }
                System.out.println();
                
        }
        scanner.close();
    }
}
