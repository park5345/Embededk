package javabasic;

public class Variable2 {
	
	// 1. static 변수 
	// 1) 클래스 로딩 타임에 JVM 이 관리하는 Method Area 라는 메모리 영역에 생김
	// 2) 객체 생성없이 사용할 수 있는 변수
	// 3) 클래스의 모든 객체들이 값을 공유하는 변수
	// static member variable
	static int si = 1;
	
	// 2. non static 변수
	// 1) 실행타임에 JVM 이 관리하는 Heap Area 라는 메모리 영역에 생김
	// 2) 객체가 생성되면 객체마다 가지게 되는 변수 = 객체마다 변수의 값을 달리할 수 있다.
	// non static member variable
	int nsi = 2;
	
	//static member method
	public static void main(String[] args) {
		
		Variable2 v2_1 = new Variable2();
		Variable2 v2_2 = new Variable2();
		System.out.println(v2_1.si); // 1
		System.out.println(v2_2.si); // 1
		
		// static 변수는 메모리에 한번만 만들어 지고 모든 객체들이 값을 고유함
		v2_1.si = 2;
		System.out.println(v2_1.si); // 2
		System.out.println(v2_2.si); // 2
		
		System.out.println(v2_1.nsi); // 2
		System.out.println(v2_2.nsi); // 2
		
		// non static 변수는 객체마다 하나씩 가지게 되는 변수
		v2_1.nsi = 5;
		
		System.out.println(v2_1.nsi); // 5
		System.out.println(v2_2.nsi); // 2
		
		// main method 의 지역 변수
		// main method 가 호출되면 메모리에 생겼다가 main method 가 종료되면 소멸
		int li = 3;
		System.out.println(li);
	
	}// main
	
	//non static member method
	public int add(int i, int j) {
		// add method 의 지역변수
		int sum = i + j;
		return sum;
		//System.out.println(li); 			오류
		
		//System.out.println(sum);		오류
	}// add method 

}// class
