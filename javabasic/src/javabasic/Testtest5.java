package javabasic;

public class Testtest5 {

	public static void main(String[] args) {
		
		char ch = 'E';
		int num = 47;
		
		int chToNum = 0;
		char intToch = ' ';
		
		//int 와 char 는 자동 형변환
		//char --> int 로 변경할떄는 자동형변환 가능
		chToNum = ch;
		// int --> char 변경할 때는 강제 형변환
		intToch = (char)num;
		
		System.out.println(chToNum);
		System.out.println(intToch);
	}

}
