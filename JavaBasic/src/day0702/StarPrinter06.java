package day0702;

import java.util.Scanner;

public class StarPrinter06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("사용자 입력: ");
        System.out.print(">");
        int user = scanner.nextInt();
        
        for(int i = 1; i <= user; i++) {
            for(int j = 1; j <= i -1; j++) {           
                System.out.print(" ");
            }    
            for(int j = i; j <= user; j++) {
                System.out.print("*");    
            }
            for(int j = i; j+1 <= user; j++) {
                
                System.out.print("*");
            }
            
            
            System.out.println("");
        }
        scanner.close();
   }
}