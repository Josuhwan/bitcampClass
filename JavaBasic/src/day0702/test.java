package day0702;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("사용자 입력: ");
        System.out.print(">");
        int user = scanner.nextInt();
        
        for(int i = 1; i <= user; i++) {
            for(int j = 1; j <= i; j++) {
                if(i == 5) {
                    System.out.print("****");
                    break;
                } else {
                System.out.print("*");
                }
                
            }
            
            System.out.println("");
        }
   }
}
