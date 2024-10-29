package javabasic;

public class ExConditionalStatement2 {
	
	public static void main(String[] args) {
		
		int score = 81;
		
		if ( 90<score && score<100) {
			System.out.println("A");
		}else if ( 80<score && score<90) {
			System.out.println("B");
		}else if ( 70<score && score<80) {
			System.out.println("C");
		}else if ( 60<score && score<70) {
			System.out.println("D");
		}else if ( score<60) {
			System.out.println("F");
		}				
	}

}
