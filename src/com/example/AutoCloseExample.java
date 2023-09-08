package com.example;

public class AutoCloseExample {
	
	static class Alpha implements AutoCloseable {
		
		void show() throws Exception {
			System.out.println("show()...");
			throw new Exception();
		}
		
		@Override
		public void close() throws Exception {
			// TODO Auto-generated method stub
			
		}

	}
	
	public static void main(String[] args) {
		
		Alpha a = new Alpha();
		
		try {
			a.close();
		} catch (Exception e) {
			
		} finally {
			try {
			a.close();
		} catch (Exception e) {
			System.out.println("exception 발생");
		}
       
	   System.out.println("Program End...");
	}
  }

	
	public static void main2(String[] args) {
		try (Alpha a = new Alpha()) {
			a.show();
		} catch (Exception e) {
			
		}
	}
}
//		void close() throws Exception {
//			System.out.println("close...");
//			throw new Exception();
//		}
//	}


