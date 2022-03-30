package exceptionExamples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		try {
			byte a = sc.nextByte();
			System.out.println(a+a);
		}
		catch(InputMismatchException e) {
			System.out.println("Enter a number between -128 and 127");
		}
		sc.close();
	}

}
