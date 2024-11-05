package javabasic.project;

public class JavaLottoTip {
	
/*	데이터 정의

	사용자가 입력한 숫자들을 저장할 배열 : 크기 6
	int[] userNums = new int[6];
	컴퓨터로 추출한 숫자들을 저장할 배열 : 크기 7
	int[] comNums = new int[7];
	 

	기능 정의

	1.사용자에게 6개의 1~45중 정수를 입력받는다 inputUserNums
	=> 6개 입력 확인 그렇지 않다면 6개를 다시 입력
	=> 입력한 것들이 숫자인지 확인 그렇지 않다면 6개 다시 입력
	=> 입력한 숫자의 범위가 1~45 사이인지도 확인
	=> 6개 입력했는데 중복된 숫자가 있는지 확인 
	=> 중복체크는 컴퓨터가 랜덤숫자 뽑아낼때도 사용 별도의 로직 분리
	void inputUserNums() {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.readline();
		StringTokenizer st = new StringTokenizer(line);
		int i = 0;
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			userNums[i] = Integer.parseInt(st.nextToken());
			i++
		}
	}
	2.컴퓨터에서 7개의 1~45중의 정수를 랜덤 추출 getComNums
	=> 중복체크해서 7개가 모두 다른 수 여야 한다.
	void getComNums() {
		int comNumsLeng = comNums.length;
		for ( int i = 0; i < comNumsLeng; i ++ ) {
			int randomNum = (int) (Math.random() * 45) + 1;
			if (!checkDup(randomNum) {
				comNums[i] = randomNum;
			}else {
			i--;
		}
	}
	3.중복체크 해야한다 checkDup
	boolean checkDup (int num) {
		int comNumsLeng = comNums.length;
		for ( int i = 0; i < comNumsLeng; i ++ ) {
		if ( comNums[i] == num ) return true; 
		}
		return false;
	}

	4.사용자의 입력 과 컴퓨터에서 추출한 숫자를 비교해서 맞은 수를 리턴한다 getCorrectNums
	int getCorrectNums() {
		// 두 배열을 교차해서 맞은 숫자의 수를 리턴하는 코드
	}

	5.결과를 출력한다 printResult
	
	
*/
}
