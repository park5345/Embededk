package javabasic;

public class Wrapper {
	
	public static void main(String[] args) {
		 
		byte b = 1;					// 1바이트 정수, 값의 범위 -2^7 ~ 2^7
		short s = 2;					// 2바이트 정수, 값의 범위 -2^15 ~ 2^15-1
		int i = 3;						// 4바이트 정수, 값의 범위 -2^31 ~ 2^31-1, 정수의 기본타입
		long l = 4;					// 8바이트 정수, 값의 범위 -2^63 ~ 2^63-1
		float f = 3.14f;  			// 4바이트 실수	, 3.14는 double 이므로 3.14f 라고 써서 
											// 4바이트 3.14임을 알려줘야함
		double d = 2.1;				// 8바이트 실수, 실수의 기본타입
		char c = 'A';					// 2바이트 유니코드 문자
		boolean bool = true;		// 1바이트 true or false 의 값만 가짐
		
		// Wrapper class 
		// Wrapping : 기본타입의 값을 갖는 참조타입을 생성 = Boxing
		// 기본타입마다 해당하는 래퍼 클래스를 제공한다.
		Byte wb = new Byte(b);
		Short ws = new Short(s);
		Integer wi = new Integer(i);
		Long wl = new Long(l);
		Float wf = new Float(f);
		Double wd = new Double(d);
		Character wc = new Character(c);
		Boolean wbool = new Boolean(bool);
		
		// Unwrapping : 참조타입이 가지고 있는 기본타입의 값을 꺼내는것 = Unboxing
		System.out.println(wb.byteValue());
		System.out.println(ws.shortValue());
		System.out.println(wi.intValue());
		System.out.println(wl.longValue());
		System.out.println(wf.floatValue());
		System.out.println(wd.doubleValue());
		System.out.println(wc.charValue());
		System.out.println(wbool.booleanValue());
		
		// auto wrapping, auto unwrapping
		// auto wrapping : wrapping 이 자동으로 일어나는 것
		// 3은 int 타입인데 Integer 타입에 할당해야함
		// 자동으로 3이 new Integer(3)이 된다. => auto wrapping
		Integer i2 = 3;
		// auto unwrapping : unwrapping 이 자동으로 일어나는 것
		// i2 는 Integer 타입이므로 + 연산을 위해서 i2 가 가진 값 3을 자동으로 꺼냄
		// i2.intValue(3) 연산이 자동으로 수행
		int result = i2 + 5;
		
		
	}

}
