package javabasic;

public class Array {
	
	public static void main(String[] args) {
		
		// 배열 선언 : 타입 과 변수 명을 정함 , 아직까지 메모리에는 없음
		int[] intArr;
		// int intArr[]; 문법적 오류는 없지만 int 타입과 혼동되기 쉬우므로 비추
		
		// 배열 초기화 
		// 메모리에 5개의 int 를 저장할 공간이 생성됨 ( 20byte )
		// int 의 기본값이 0 이므로 다섯개의 공간에 0으로 초기화 됨
		// 배열의 크기 = 요소 ( element ) 의 개수 = length (여기서는 5)
		// 배열 요소의 순서 = index = (여기서 index 범위는 0 ~ 4)
		// index의 범위 = 0 ~ length -1
		intArr = new int[5];
		// 배열 할당 
		
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		
		// 문법적 오류가 없으므로 컴파일에는 문제 없음
		// index 범위는 0~4, 5인덱스는 범위 밖 
		//	 => 실행시 오류(ArrayIndexOutOfBoundsException) 발생
		//intArr[5] = 6;
		
		// 배열 내의 요소들의 값을 출력
		// intArr.length라는 고정값에 대해 계속 연산하는 문제
		// intArr.length 연산은 1번이면 족한다. 
		// for 문의 조건식에 사용하면 for 문 반복 회수만큼 연산 하게 된다
		// 마이크로 소프트 : code complete 
		// 마틴 파울러 : refactoring 코드개선
		int intArrLength = intArr.length;
		for ( int i = 0; i < intArrLength; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		//배열 선언, 초기화, 할당을 동시에 하는 코드
		int[] intArr2 = {1,2,3,4,5};
		// 향상된 for 문 ( enhanved for statement )
		// 요소의 length만큼 반복하면서 각 요소의 값을 앞에 선언한 변수에 할당
		for ( int i : intArr2 ) {
			System.out.print( i + " ");
		}
		System.out.println();
		//문자열 배열
		String[] strArr = {"hello","java","programming"};
		
		for ( String str : strArr) {
			System.out.println(str);
		}
		
		
	}// main

}// class
