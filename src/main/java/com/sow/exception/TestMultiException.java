package com.sow.exception;

public class TestMultiException {
	public static void main(String args[]) {
		try {
			int array[] = new int[10];
			array[10] = 30 / 0;
		} 
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		/* exceptions must follow from specific to generalised below code will give error **/
//		catch(Exception | ArithmeticException | ArrayIndexOutOfBoundsException e){  
//            System.out.println(e.getMessage());  
//        }
	}
}
