package javabasic;

import java.util.Scanner;

public class ExConsoleIO1 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("곱할 두 수를 입력해주세요. ");
	
	int firstInt = 0;
	int secondInt = 0;
	
	if (sc.hasNext()) {
		
		firstInt = sc.nextInt();
		secondInt = sc.nextInt();
		
	}
	
	int sum = firstInt * secondInt;
			
	System.out.println("두 수의 곱은 " + sum + " 입니다 ");
	
	sc.close();
	
	}

}
