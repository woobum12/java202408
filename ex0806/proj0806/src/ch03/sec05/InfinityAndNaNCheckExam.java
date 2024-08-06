package ch03.sec05;

public class InfinityAndNaNCheckExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;
//		Infinity
		double z1 = x / y;
//		Nan
		double z2 = x % y;
		System.out.println(z1 + ":" +z2);
		
		//잘못된 코드
		
		//알맞은 코드
//		산술연산코드의 예외처리 방법으로 사용하기 좋다
		double z = x / y;
		if(Double.isInfinite(z)|| Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
		}
	}

}
