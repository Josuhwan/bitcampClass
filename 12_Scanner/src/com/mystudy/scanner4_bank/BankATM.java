package com.mystudy.scanner4_bank;

import java.util.Scanner;

//[실습] 은행의 ATM 기계 만들기
// 1.입금  2.출금  3.통장확인  0.종료
//-----------------------------------
// 계좌를 하나 만들고 입금/출금/통장확인 작업을 처리
public class BankATM {
	private int money; //통장 계좌(금액)
	private Scanner scan = new Scanner(System.in);

		
	public void startBank() {
		System.out.println(">> ATM 메뉴");
		System.out.println("1.입금  2.출금  3.통장확인  0.종료 ");
		System.out.print(">> ");
		int menu = scan.nextInt();
		
		while (!(menu >= 0 && menu <= 3)) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.print(">>");
            menu = scan.nextInt();
        }
		
		if (menu == 1) {
			deposit();
		} else if (menu == 2) {
			withdraw();
		} else if (menu == 3) {
			accountConfirm();
		} else if (menu == 0) {
			System.out.println("이용해주셔서 감사합니다.");
		} else {
			System.out.println("다시 입력해주세요");
		}
	}
	
	public void deposit() {
		System.out.println("입금하실 금액을 입력해주세요");
		System.out.print(">> 입금액 : ");
		money += scan.nextInt();
		System.out.println("통잔잔액 : " + money + "원");
		System.out.println("----------------------------------");
		startBank();
	}
	
	public void withdraw() {
		System.out.println("출금하실 금액을 입력해주세요");
		System.out.print(">> 출금액 : ");
		int wMoney = scan.nextInt();
		if (money == 0) {
			System.out.println();
			System.out.println("----------------------------------");
			System.out.println(" 출금 할 잔액이 없습니다");
			System.out.println(" >> 메인메뉴로 이동");
			System.out.println("----------------------------------");
			startBank();
		} else if (wMoney > money) {
			System.out.println("----------------------------------");
			System.out.println("잔액이 부족합니다");
			System.out.println("다시입력~~~");
			System.out.println("통잔잔액 : " + money + "원");
			System.out.println("----------------------------------");
			withdraw();
		} else if (wMoney < money) {	
			money -= wMoney;
			System.out.println("통잔잔액 : " + money + "원");
			System.out.println("----------------------------------");
			startBank();
		}
	}
	
	public void accountConfirm() {
		System.out.println("통잔잔액 : " + money + "원");
		System.out.println("----------------------------------");
		startBank();
	}
}


/*
1.입금  2.출금  3.통장확인  0.종료
>> 작업선택 : 1
>> 입금액 : 10000
::통장금액 : 10000원

1.입금  2.출금  3.통장확인  0.종료
>> 작업선택 : 2
>> 출금액 : 5000
::통장금액 : 5000원

1.입금  2.출금  3.통장확인  0.종료
>> 작업선택 : 3
::통장금액 : 5000원

1.입금  2.출금  3.통장확인  0.종료
>> 작업선택 : 0
>> 작업을 종료합니다
*/
