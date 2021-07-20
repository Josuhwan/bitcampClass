package com.mystudy.phone;

public class Phone {
		// 속성(property)
		String name; 
		String type;
		int hsize; 
		int vsize; 
		boolean hasLCD;
	
		Phone() {}
		Phone(String name, String type) {
			this.name = name;
			this.type = type;
		}
		
		Phone(String name, String type, boolean hasLCD) {			
			this(name,type);
			this.hasLCD = hasLCD;
		}
		
		void call() {
			System.out.println(">> 전화걸기");
		
		}
		
		void receiveCall() {
			System.out.println(">> 전화받기");
		
		}
		
		void sendSms(String msg) {
			System.out.println("[메시지전송]" + msg);
		}
		
		String receiveSms(String msg) {
			System.out.println("[메시지수신]" + msg);
			return msg;
		}
		
		void view() {
			System.out.println("--- 전화기 정보 ---");
			System.out.println("모델명 : " + name);
			System.out.println("타입 : " + type);
			System.out.println("가로크기 : "+ hsize);
			System.out.println("세로크기 : "+ vsize);
			System.out.println("LCD유무 : " + hasLCD);
		}
		
		
	}
