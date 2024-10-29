package javabasic;

public class FlowControlStatement {

	public static void main(String[] args) {

		// 조건문 if
		int i1 = 5;

		if (i1 > 5) {
			System.out.println("i1은 5보다 크다.");
		} else {
			System.out.println("i1은 5보다 크지않다");
		}

		i1 = 35;
		if (i1 < 10) {
			System.out.println("i1은 10보다 작다");
		} else if (i1 < 20) {
			System.out.println("i1은 20보다 작다");
		} else if (i1 < 30) {
			System.out.println("i1은 30보다 작다");
		} else {
			System.out.println("i1은 30보다 작지않다");
		}

		// 조건문 switch
		int yoil = 3;
		switch (yoil) {
		case 0:	System.out.println("일요일");	break;
		case 1:	System.out.println("월요일");	break;
		case 2:	System.out.println("화요일");	break;
		case 3:	System.out.println("수요일");break;
		case 4:	System.out.println("목요일");break;
		case 5:	System.out.println("금요일");	break;
		case 6:	System.out.println("토요일");	}

		// 위 switch 구문을 if 로 변경
		int yoil1 = 3;
		if (yoil1 == 0) System.out.println("일요일");
		 else if (yoil1 == 1) System.out.println("월요일");
		 else if (yoil1 == 2) System.out.println("화요일");
		 else if (yoil1 == 3) System.out.println("수요일");
		 else if (yoil1 == 4) System.out.println("목요일");
		 else if (yoil1 == 5) 	System.out.println("금요일");
		 else System.out.println("토요일");	
		 
		// swtch 구문의 값으로 문자열이 올 수 있음
		switch ("남자") {
			case"남자" : System.out.println("male"); break;
			case"여자" : System.out.println("female"); 
		}
		
		//반복문 for (초기식; 조건식; 증감식;) { 수행할 구문 }
		//실행순서 
		// 1. 초기식 수행 (int i = 0;)
		// 2. 조건식 수행 (i < 10)
		// 3. 조건식이 참이면 for 블럭 수행
		// 4. 증감식 수행 (i++)
		// 5. 3~4 조건식이 false 일때까지 반복
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		//for 문을 이용해 1~100 정수 중에서 홀수만 출력
		for ( int i = 1; i < 100; i=i+2) {
			System.out.println(i);
		}
		 // 실습 : for 문을 이용해서 50부터 100 까지 정수중에서 3의 배수만 출력
		/*for (int i = 49; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		*/ // 내가 실습한 구문
		for (int i = 51; i < 100; i=i+3) {
			System.out.println(i);
		}
		
		// 반복문 while 
		// 조건이 참인 동안 반복적으로 while 블럭을 수행
		// 무한루프에 빠지지 않도록 조건이 false 경우를 만들어준다.
		int i2 = 1;
		while (i2 < 10) {
			System.out.println(i2);
			i2++;
		}
		
		// 반복문 do ~ while 
		// 한번은 do 블럭을 수행하고 while 의 조건이 참인 동안 반복수행
		do {System.out.println(i2);
			i2++;
		}while (i2 <5);
		
		// 실습 : while 문을 이용해서 1~ 100중에서 짝수만 출력
		int i3 = 1;
		while(i3 <=100) {
			if (i3 % 2 == 0)	System.out.println(i3++);	}
		// 실습 : while 문을 이용해서 50~100 에서 정수중 7의 배수만 출력
		int i4 = 50;
		while(i4 <= 100) {
			if (i4 % 7 == 0  ) {	System.out.println(i4++);	}
			
		}
	
	}// main
	
}// class
