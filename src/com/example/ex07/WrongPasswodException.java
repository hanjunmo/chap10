package com.example.ex07;

public class WrongPasswodException extends Exception {
	public WrongPasswodException() {
		
	}
	
	public WrongPasswodException(String message) {
		super(message);
	}

}
