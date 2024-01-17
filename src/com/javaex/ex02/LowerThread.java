package com.javaex.ex02;

public class LowerThread extends Thread{
	
	public void run() {
		for(int i=0;i<=25;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
