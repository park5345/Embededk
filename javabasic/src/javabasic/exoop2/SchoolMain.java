package javabasic.exoop2;

public class SchoolMain {
	
	public static void main(String[] args) {
		
		SchoolFactory schoolFactory = new SchoolFactory();
		
		schoolcount(schoolFactory,"가양초등학교","썬",30);
		schoolcount(schoolFactory,"경서중등학교","루나",32);
		schoolcount(schoolFactory,"마포고등학교","스타",35);
		
	}
	private static void schoolcount(
			SchoolFactory schoolFactory,String school,String name , int student ) {
		
	}
}
