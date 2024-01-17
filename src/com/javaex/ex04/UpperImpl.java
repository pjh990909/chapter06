package com.javaex.ex04;

public class UpperImpl implements Runnable{
	
	public void run() {
		for(int i=0;i<=15;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}
