package day0702;

import java.util.Scanner;

public class StarPrinter10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("사용자 입력: ");
        System.out.print(">");
        int user = scanner.nextInt();
        
        for(int i = 1; i <= user; i++) {
            for(int j = user; j >= i; j--) {  
                System.out.print("*");
            }    
            for(int j = 1; j < i; j++) {
                System.out.print(" ");        
            }
            for(int j = 2; j < i; j++) {
                System.out.print(" ");  
            }
            
            for(int j = i; j <= user; j++) {
                if(i == 1 && j == user) {
                   break;
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        
        for(int i = 1; i <= user-1; i++) {
            for(int j = 1; j <= i+1; j++) {           
                System.out.print("*");
            }    
            for(int j = i; j < user-1; j++) {
                System.out.print(" ");    
            }
            for(int j = i+1; j < user-1; j++) {
                
                System.out.print(" ");
            }
            for(int j = 1; j <= i+1; j++) {
                if(i+1 == user && j == user) {
                    break;
                } else {
                System.out.print("*");    
                }
            }
            System.out.println("");
        }    
        scanner.close();
   }
}
