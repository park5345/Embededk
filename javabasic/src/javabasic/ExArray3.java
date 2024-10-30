package javabasic;

public class ExArray3 {

	public static void main(String[] args) {

		String[][] str = { 
				{ "홍길동", "90", "80", "70" },
				{ "강감찬", "80", "70", "60" }, 
				{ "이순신", "60", "50", "40" } };
		System.out.println(str[0][0] + " : 국어 " + str[0][1] + "점, 영어 " + str[0][2] + "점, 수학 " + str[0][3] + "점");
		System.out.println(str[1][0] + " : 국어 " + str[1][1] + "점, 영어 " + str[1][2] + "점, 수학 " + str[1][3] + "점");
		System.out.println(str[2][0] + " : 국어 " + str[2][1] + "점, 영어 " + str[2][2] + "점, 수학 " + str[2][3] + "점");

		int[] score = { 0, 0, 0 };
		int scoreArr = str.length;
		int scoreAr = str[0].length;
		int scoreA = score.length;
		for (int i = 0; i < scoreArr; i++) {
			for (int j = 0; j < scoreAr; j++) {
				if (j > 0) {
					score[i] += Integer.parseInt(str[i][j]);
				}
			}
		}
		for (int i = 0; i < scoreA; i ++) {
			if ( score[i] >= 200) {
				System.out.println(str[i][0] + " 학생의 총점은 " + score[i] + " 입니다 .");
			}
		}
	}// main

}// class
