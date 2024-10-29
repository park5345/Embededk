package javabasic;

public class ExLoopStatement2 {
	
	public static void main(String[] args) {
		
		// 별짓기 1
		// i = 0 j = 0
		// i = 1 j = 0 1
		// i = 2 j = 0 1 2
		// i = 3 j = 0 1 2 3 
		// i = 4 j = 0 1 2 3 4
		for (int i = 0; i <5; i++) { //줄의 수 i
			for(int j = 0; j <i+1; j++) { // 별의 수 j
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("                                             ");
		// 별짓기 2
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("                                             ");
		// 별짓기 3
		// i = 0 , j = 0 k = 0 1 2 3 4
		// i = 1 j = 0 1 k = 0 1 2 3
		// i = 2 j = 0 1 2 k = 0 1 2 
		// i = 3 j = 0 1 2 3 k = 0 1
		// i = 4 j = 0 1 2 3 4 k = 0
		for (int i = 0; i < 5; i ++) { // 줄의 수
			for(int j = 0; j<i; j++) { // 공백의 수
				System.out.print("  ");
			}
			for(int k = 5; k > i; k--) {// 별의 수
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("                                             ");
		// 별짓기 4
		for (int i = 0; i < 6; i++) {
			for(int j = 5; j>i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k<i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("                                             ");
		// 별짓기 5
		for (int i = 0; i <5; i++ ) { // 줄
			for ( int j = 0; j < 5; j++) {// 별
				if (i > 0 && j >0 && i < 4 && j < 4 ) {
					System.out.print("  ");
				}else
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("                                             ");
		// 별짓기 6
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ( i == j  ) {System.out.print("*");}
				else if( i == 0 && j == 4) {System.out.print("*");}
				else if ( i == 1 && j == 3) {System.out.print("*");}
				else if ( i == 3 && j == 1) {System.out.print("*");}
				else if ( i == 4 && j == 0) {System.out.print("*");}
				else System.out.print("  ");}
			System.out.println();
		}
		System.out.println("                                             ");
		// 별짓기 7
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 1 && j == 2) {System.out.print("  ");}
				else if (i == 2 && j <= 3 && j >=1 && j !=2 ) 
				{System.out.print("  ");}
				else if (i==3 && j ==2) 
				{System.out.print("  ");}
				else
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	}// main
}// class

