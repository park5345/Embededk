package javabasic.exoop2;

public class SchoolFactory {
	
	private static int count;
	
	public School schoolcount (String school, String name , int student) {
		
		System.out.println("학교의 이름은 " + school + " 입니다.");
		System.out.print("교실 이름은 " + name + " 이고");
		System.out.println("학생 수는 " + student + "명 입니다.");		
		System.out.println("총 학교 수는 " + ++count + "개 입니다.");		
		return new School (school, name, student);
	}
	
	public static int getCount() {
		return count;
	}
}
