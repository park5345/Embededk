package javabasic;

public class Operator {
	
	public static void main(String[] args) {
		
		// 단항 연산자
		int i1 = 5;		// + 부호 생략
		int j1 = -i1; 
		
		// 전치 , 후치 연산자
		int i2 = ++i1; 	// 전치 연산자 i1이 1 증가하고 증가된 값이 i2에 할당
		int i3 = i1++; 	// 후치 연산자 i1이 i3에 할당된 다음 i1이 1 증가
		
		// 삼항 연산자
		int i4 = 5;
		int j2 = i4 > 5 ? 1 : 2; // i4 가 5보다 클때 1 아닌경우 2 가 j2에 할당
		// if 문 변경
/*		int j2 = 0;
		if (i4 > 5) {
			j2 = 1;
		}else {
			j2 = 2;
		}
*/	
		// 비트 연산자
		byte b1 = 3; 	// 00000011
		byte b2 = ~3; 	// 00000011 > 11111100 비트 반전
		System.out.println(b2); // -4
		
		// 양수  > 음수  ( 3 > -3 ) 연산법
		// 1. 모든 비트를 반전시킴
		// 2. 1을 더함
		// ex ) 00000011(3) > 11111100(-4) + 1 > 11111101(-3)
		
		byte b3 = 5; // 00000101
		byte b4 = 3 | 5; // 00000011 | 00000101 => 00000111 (7) (bit or)
		byte b5 = 3 & 5; // 00000011 & 00000101 => 00000001 (1) (bit and)
		byte b6 = 3 ^ 5; // 00000011 ^ 00000101 => 00000110 (6) (bit xor)
		
		//쉬프트 연산자 (비트 이동)
		byte b7 = 5; // 00000101
		// 비트를 오른쪽으로 3칸 이동 나머지는 0으로 채운다
		byte b8 = 5 >> 3; // 00000101 > 00000000 (0)
		byte b9 = (byte)(-5 >>> 3); // 11111011(-5) > 11111111 (-1)
		byte b11 = 3 << 2; // 00000011(3) > 00001100 (12)
		
		// 나머지 연산자 : 홀수, 짝수, 배수 연산시 사용
		int i5 = 7;
		int j5 = 3;
		System.out.println(i5 % j5); // 1
		
		// 관계 연산자 : 값의 크기를 비교 결과는 항상 true or false 
		int i6 = 10;
		int j6 = 5;
		System.out.println(i6 == j6);
		System.out.println(i6 != j6);
		System.out.println(i6 > j6);
		System.out.println(i6 < j6);
		System.out.println(i6 >= j6);
		System.out.println(i6 <= j6);
		
		// 논리 연산자 : 
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(!bool1); // false 논리 부정
		System.out.println(bool1 & bool2); // false 둘다 true 여야 true 논리 곱
		System.out.println(bool1 | bool2); // true 둘 중 하나라도 true 면 true 논리 합
		
		// && : 앞의 결과가 false 이면 뒤의 연산을 수행하지 않음 ( 전체 결과가 false 니까 )
		// 연산속도 향상을 위해 만들어진 연산자
		int i7 = 10;
		int j7 = 5;
		if (i7 > 10 && j7 < 10) {
			System.out.println("i7은 j7보다 크다");
		}
		
		// || : 앞의 결과가 true 이면 뒤의 연산을 수행하지 않음 ( 전체 결과가 true 니까 )
		
		// 대입 연산자 ( = 할당 = 저장) (우항의 값을 좌항에 넣는다 )
		// 연산 방향 우 > 좌
		int i8 = 5;
		int i9 = 3;
		i9 += i8; // i9 = i9 + i8;
		i9 *= i8; // i9 = i9 * i8;
		i9 -= i8; // i9 = i9 - i8;
		i9 %= i8; // i9 = i9 % i8;
		i9 /= i8; // i9 = i9 / i8;
		
		// 연산자 우선 순위 : 연산자가 동시에 여러개 사용되면 연산의 우선순위가 연산자에 따라 결정됨
		// () 가 연산 우선순위 가장 높음
		// 대입연산자가 우선순위 가장 낮음
		
	}// main

}// class
