package ch04.secPr;

public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i;
		
		for (i=1; i<=100; i++) {
			if (i % 3 == 0) 
			sum += i;
		}
		System.out.println("1에서 100까지 3의 배수합 :" + sum);
	}

}
