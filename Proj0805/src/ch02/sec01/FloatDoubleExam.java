package ch02.sec01;

public class FloatDoubleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		정밀도 확인 / float : 숫자끝에 f를 붙여준다
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		
//		10의 거듭제곱 리터럴 / 자바는 소수점(.)만나면 기본적으로 double이라고 인식한다.
		double var3 = 3e6;
//		3*10의6승, 3*10의6승float, 2*10의 -3승
		float var4 = 3e6F;
		double var5 = 2e-3;
		System.out.println("var3: "+ var3);
		System.out.println("var4: "+ var4);
		System.out.println("var5: "+ var5);
	}

}
