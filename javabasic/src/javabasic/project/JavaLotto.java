package javabasic.project;

import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaLotto {
	// 1. 기능
	// 1) 사용자에게 1~ 45 중 중복되지 않은 6개의 정수를 입력받는다.
	// 2) 컴퓨터가 발생시킨 중복되지 않은 7개의 정수를 랜덤하게 뽑아낸다
	// (6개는 로또 번호 7번째 보너스번호)
	// 3) 로또 당첨규칙에 따라서 사용자의 당첨등수를 출력한다.
	// 2. 규칙
	// 1) 사용자가 입력한 6개의 로또번호 와 프로그램이 랜덤하게 뽑은 앞의 6개 번호가 모두 일치하면 1등
	// 2) 사용자가 입력한 6개의 로또번호 와 프로그램이 랜덤하게 뽑은 앞의 6개 번호중 5개가 일치하고
	// 보너스 번호가 일치하면 2등
	// 3) 사용자가 입력한 6개의 로또번호 와 프로그램이 랜덤하게 뽑은 앞의 6개 번호중 5개가 일치 3등
	// 4) 사용자가 입력한 6개의 로또번호 와 프로그램이 랜덤하게 뽑은 앞의 6개 번호중 4개가 일치 4등
	// 5) 사용자가 입력한 6개의 로또번호 와 프로그램이 랜덤하게 뽑은 앞의 6개 번호중 3개가 일치 5등
	// 6) 나머지는 꽝! 다음 기회에!

	// 3. 출력 예시
	// 1) 로또번호 6개를 입력해주세요!
	// 2) 21 3 8 9 40 33
	// 3) 추첨번호는 3 8 33 22 10 34 (보너스 번호 : 45)
	// 4) 5등입니다!
	public static void main(String[] args) {

		// 랜덤 정수 추출
			// Math.random() : 0.0<= n < 1.0 범위의 실수를 반환하는 메소드
			// int randomNumber = (int)(Math.random()*44)+1; // 1~10
			int[] randomNumber = new int[6];
			int bonusNumber = (int)((Math.random()*44)+1);
			int randomNum = randomNumber.length;
			int count = 0;
			boolean check = false;
				// 스캐너 생성
			Scanner scanner = new Scanner(System.in);
				// 한 라인의 문자열 입력
			System.out.println("로또 번호 6개를 입력해 주세요.");
			String line = scanner.nextLine();
			System.out.print("당첨 번호는 ");
			for (int i = 0; i < randomNumber.length; i++) {
				randomNumber[i] = (int)((Math.random()*44)+1);
				for (int j = 0; j < i; j ++) {
					if (randomNumber[i] == randomNumber[j]) {
						i--;
					}
				}
				if (bonusNumber == randomNumber[i]) {
					i--;
					}
				}
			for( int i = 0; i < randomNum; i++ ) {
				
			System.out.print(randomNumber[i] + " ");
			}
			System.out.println("보너스 번호는 " + bonusNumber);
			// 문자열을 공백문자 기준으로 토크나이징 (토큰으로 분리)
			StringTokenizer st = new StringTokenizer(line);
			// 토큰이 있는 동안 반복
			while (st.hasMoreTokens()) {
				// 토큰 하나씩 가져와서 출력
				String token = st.nextToken();
				//userNumber[i] = Integer.parseInt(st.nextToken());
				System.out.print(token + " ");
			}
			// 당첨 규칙에 따른 사용자 등수
			for (int i = 0; i < randomNum; i++) {
				for(int j = 0; j <randomNum; j++) {
					if(randomNumber[i] == randomNumber[j]) {
						count++;
						break;
					}
				}
			//보너스번호 맞는것 찾기
				if(!check) {
					if(randomNumber[i] == bonusNumber) {
						check = true;
					}
				}
			}
			if(count == 6) {
				System.out.println("1등");
			}else if(count == 5 && check) {
				System.out.println("2등");
			}else if(count == 5 ) {
				System.out.println("3등");
			}else if(count == 4 ) {
				System.out.println("4등");
			}else if(count == 3 ) {
				System.out.println("5등");
			}else {
				System.out.println("낙첨");
			}			
	
			scanner.close();
	}
}
