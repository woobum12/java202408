package ch03.sec04;

public class AccuracyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
//		몇조각 남았는지 = 사과1개 - (7조각 * 0.1)
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
	}

}
