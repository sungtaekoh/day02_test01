package day02_test01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		/*
		 * 변수는 언제든지 변경 하라 수 잇는 값
		 * 변경 할 수없는 값은 상수이다
		 * 
		 * 변수를 상수화 시켜서 사용 할 수 있다
		 */
		final int i = 100;
//		fianl을 붙여 변경을 못 하게 만든다
//		i = 200;
		/*
		 * fianl을 붙여 상수화 시켰기 때문에 변경 할 수 없다
		 * 때문에 억지로 변경하려 할 경우 에러가 발생한다
		 */
		System.out.println(i);
	
//		상수가 필요한 이유
		/*
		 * 절대적으로 변하면 안되는 값들이 존재한다
		 * 
		 */
		
		final String KOREA = "대한민국";
//		문자열은 쌍따움표로 묶어준다
//		KOREA = "미국";
		System.out.println(KOREA);
//		변경하면 안되는 상표값에서 사용한다
		
		
	
	
	}

}
