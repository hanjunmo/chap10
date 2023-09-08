package com.example.ex07;

public class LoginExample {

	public static void main(String[] args) {
		
		try {
			login("blue", "1234");
			System.out.println("로그인 성공");
		} catch (NotExistIDException e) {
			System.out.println(e.getMessage());
		} catch (WrongPasswodException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void login(String id, String passwod) throws NotExistIDException, WrongPasswodException {
		if (!id.equals("blue"))
			throw new NotExistIDException("ID가 존재하지 않습니다.");
		
		if (!passwod.equals("12345"))
			throw new WrongPasswodException("패스워드가 틀립니다.");
	}

}
