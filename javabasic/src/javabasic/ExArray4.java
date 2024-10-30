package javabasic;

import java.util.Scanner;

public class ExArray4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//데이터를 저장할 배열
		String[][] str = new String[3][4];
		int inPut = str.length;
		int inPutArr = str[0].length;
		int[]total = {0,0,0};
		double avg = 0;
		// Scanner 를 통해 데이터를 배열에 저장
		for (int i = 0; i < inPut; i ++) {
			for (int j = 0; j < inPutArr; j ++) {
				str[i][j] = sc.next();
					if (j > 0) {
						total[i] += Integer.parseInt(str[i][j]);
						avg = total[i]/3;
					}
			}	
			System.out.println
			("이름은 " + str[i][0] + " 국어 점수 : " + str[i][1] + 
			 "점 영어 점수 : " + str[i][2] + "점 수학 점수 : " + str[i][3] +
			 "점 총점은 " + total[i] + " 이고 평균은 " + avg + " 입니다 .");
		}
		sc.close();
	}//main

}//class
