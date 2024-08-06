package ch03.sec03;

public class OverflowUnderflowExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		오버플로우 발생시(허용범위값을 적용)
		byte var1 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			System.out.println(); //126
			System.out.println("var1: " + var1);
		}
		
//		언더플로우 발생시(허용범위 최대값을 적용)
		System.out.println("--------------");
		byte var2 = -125;
		for (int i=0; i<5; i++) {
			var2--; //124
			System.out.println(); // 123
			System.out.println("var2: " + var2);
		}
	}

}
