package ch04.secPr;

public class ques4 {
	public static void main(String[] args) {
	while (true){
		int a = (int)(Math.random()*6) +1;
		int b = (int)(Math.random()*6) +1;
		int sum = a + b;
		System.out.println("주사위 :" + a);
		System.out.println("주사위 :" + b);
		System.out.println("주사위의 합 :" + sum);
		System.out.println("==========================");
		System.out.println("주사위의 합이 5가 되면 프로그램 종료");
		if (sum == 5) {
			break;
		}
		
	}
 }
}

