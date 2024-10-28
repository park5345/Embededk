package javabasic;

import java.util.Scanner;

public class ExConsoleIO2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3개의 문자열을 입력해 주세요.");
		
		// boolean 인 것의 개수를 저장할 변수
		int booleanCount = 0;
		
		if ( sc.hasNextBoolean()) {
			
			booleanCount = booleanCount + 1; //booleanCount++;
		} 
		
		sc.next();
		if ( sc.hasNextBoolean()) {
			
			booleanCount = booleanCount + 1; //booleanCount++;
		}
		
		sc.next();
		if ( sc.hasNextBoolean()) {
			
			booleanCount = booleanCount + 1; //booleanCount++;
		}
		
		System.out.println("총 " + booleanCount + "개의 boolean이 있습니다.");
		
		sc.close();
		
	} //main

}
// class
