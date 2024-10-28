package javabasic;

public class PrimitiveTypeCasting {
	
	public static void main(String[] args) {
		
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		float f = 1.0f;
		double d = 2.0;
		char c = 'A';
		boolean bool = true;
		
		s = b; 
		// s = (short) b; 과정이 자동으로 일어남 = 자동 형변환 = 묵시적 형변환
		b = (byte)s; 
		// 데이터 손실이 일어나 강제적 형변환 ( 형변환에 대해 개발자가 책임짐 ) = 명시적 형변환
		l = i;					// 4 > 8
		i = (int)l;			// 8 > 4
		d = f;				// 4 > 8
		f = (float)d;		// 8 > 4
		b = 65; 
		c = (char)b; 
		// c = b; // char 타입으로의 형변환은 강제 형변환 해야 함
		System.out.println(c); // A (ASCII CODE 65에 해당하는 문자)
		// boolean 타입은 다른 타입과 형변환이 불가
		// bool = b;
		// b = bool; 
	}// main

}// class
