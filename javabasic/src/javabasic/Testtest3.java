package javabasic;

import java.util.Scanner;

public class Testtest3 {
	
	public static void main(String[] args) {
		
		String source = "12 35 144" ;
		
		Scanner sc = new Scanner(source);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3 ;
		
		System.out.printf("%d + %d + %d = %d\n", num1,num2,num3,sum);
	}
		
}
