package javabasic;

public class Testtest4 {

	public static void main(String[] args) {
			
		/* 정수  byte <> int <> short <> long
								△
								▽
		 	실수	float   <  >  double	
		 	
		 	char <> int  (형변환 가능)
		 	char < x > String (클래스형태)
		*/
		int a = 35;		//a = 35 (int)
		long b = 0;		//b = 35 (long)
		byte c = 0;
		
		b = a;					//자동 형변환 작은 값에서 큰 값으로 변환
		//c = a;    		큰 데이터값에서 작은 데이터값으로는 변하기 힘들다
		
		System.out.println(b);
		
		byte b1 = 0;
		int a1 = 38;
		long c1 = 0;
		
		b1 = (byte)a1; 		// 강제 형변환 큰 값에서 작은 값으로 변환
		c1 = a1;
		
		System.out.println(b1);
		System.out.println(c1);
		
		int num01 = 15;
		long lyNum01 = 20;
		byte byNum01 = 0;
		
		lyNum01 = num01;
		
		System.out.println(lyNum01);
		
		byNum01 = (byte)num01;
		
		System.out.println(byNum01);
		
		int num02 = 130;
		byte byNum02 = 0;
		
		byNum02 = (byte)num02;
		
		System.out.println("형변환1    int --> long" + lyNum01);
		System.out.println("형변환1.1 int" + num01 + " --> long"  + lyNum01);
		System.out.println("형변환2    int --> byte" + byNum01);
		System.out.println("형변환2.1 int" + num01 + " --> byte"  + byNum01);
		System.out.println("형변환3    int --> byte" + byNum02);
		System.out.println("형변환3.1 int" + num02 + " --> byte"  + byNum02);
	}

}
