package com.example;

public class Exercise02 {
	
	public static void main(String[] args) {
		
		xxx();
	}
	
	static void xxx() {
		try {
			System.out.println("try...");
			return;
		} catch (Exception e) {
			
		} finally {
			System.out.println("finally...");
		}
	}
}
