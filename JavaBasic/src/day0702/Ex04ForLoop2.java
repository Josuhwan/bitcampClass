package day0702;

import java.util.Scanner;

public class Ex04ForLoop2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int user;
        int user2;
        int sum = 0;
        int a = 1;
        
        for(int i = 1; i <= 6; i++) {
            System.out.print(i + " ");
            
        }
        System.out.println(" ");
        System.out.println("=================");
        
        
        for(int i = 17; i >= 12; i--) {
            System.out.print(i + " ");
         
        }
        System.out.println(" ");
        System.out.println("=================");
        
        
        for(int i = 71; i <= 83; i++) {
            if(i%2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println("=================");
        

        System.out.print("입력할 숫자: ");
        user = scanner.nextInt();
        
        for(int i = 1; i <= user; i++) {
            System.out.print(i + " ");
            
        }
        System.out.println(" ");
        System.out.println("=================");
        
        System.out.print("입력할 숫자1: ");
        user = scanner.nextInt();
        System.out.print("입력할 숫자2: ");
        user2 = scanner.nextInt();
        
        if (user > user2) {
            for(int i = user; i >= user2; i--) {
                System.out.print(i + " ");
            }
            
        } else {
            for(int i = user2; i >= user; i--) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println(" ");
        System.out.println("=================");    
        
        System.out.print("입력할 숫자: ");
        user = scanner.nextInt();
        for(int i = 1; i <= user; i++) {
            sum = sum + i; 
            
        }   
        System.out.println(sum + " ");
        System.out.println("=================");    
        
        System.out.print("입력할 숫자: ");
        user = scanner.nextInt();
        for(int i = 1; i <= user; i++) {
            a = a * i;
            
        }
        System.out.println(a + " ");
        System.out.println("=================");   
        
      }
   
        
}
