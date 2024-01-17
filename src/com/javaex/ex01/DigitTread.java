package com.javaex.ex01;

public class DigitTread extends Thread{
	
	//필드
	
	//생성자
	//DigitTread()
	
	//메소드
	public void run() {
		for(int i=0; i<=30;i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	
	
	
	

}
