package javabasic;

import java.util.Scanner;

public class ConsoleIO {

	public static void main(String[] args) {

		// 표준입력(키보드입력)을 받는 Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);

		// Scanner 를 통해 입력된 문자열이 있다면 반복
		/*
		 * while (scanner.hasNext()) { // 입력한 문자열을 nextStr 변수에 저장 String nextStr =
		 * scanner.next(); System.out.println(nextStr); }
		 */

		// 두 수를 입력받아 합계를 출력하는 프로그램
		System.out.println("두 수를 입력해 주세요.");

		String firstStr = "";
		// "" = 널 스트링 첫번째 입력받을 문자열을 저장할 변수
		int firstInt = 0;
		// 0으로 초기화 첫번째 입력받은 문자열을 정수로 변환해서 저장할 변수
		String secondStr = "";
		// "" = 널 스트링 두번째 입력받을 문자열을 저장할 변수
		int secondInt = 0;
		// 0으로 초기화 두번째 입력받은 문자열을 정수로 변환해서 저장할 변수

		if (scanner.hasNext()) { // 입력받은 문자열이 있다면

			firstStr = scanner.next(); // 입력받은 문자열을 변수로 저장
			firstInt = Integer.parseInt(firstStr); // 문자열은 int 로 변환
		}

		if (scanner.hasNext()) { // 입력받은 문자열이 있다면

			secondStr = scanner.next(); // 입력받은 문자열을 변수로 저장
			secondInt = Integer.parseInt(secondStr); // 문자열은 int 로 변환
		}

		// 두 수를 더해서 sum 변수에 저장
		int sum = firstInt + secondInt;

		System.out.println("두 수의 합은 " + sum + " 입니다.");
		// + 는 문자열 접합 ( Concatenation )

		scanner.close();
		// 메모리 누수 로 인해 반드시 닫기
		// 컨트롤 쉬프트 F 줄 맞추기
	}// main

}// class
