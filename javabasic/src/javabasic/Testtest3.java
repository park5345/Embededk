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
		
		String str = "123456";
		int num = Integer.parseInt(str);
		
		String str2 = "12345678";
		int num4 = Integer.valueOf(str2).intValue();
		
		System.out.println(num);
		System.out.println(num4);
		
		sc.close();
		
	}
		
}
