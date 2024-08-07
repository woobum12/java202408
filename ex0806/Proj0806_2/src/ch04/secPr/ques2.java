package ch04.secPr;

public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "C";
		
		int score1 = 0;
		switch (grade) {
		case "A":
			score1 = 100;
			System.out.println("100점 A입니다");
			break;
		case "B":
			int result = 100 - 20;
			score1 = result;
		System.out.println("80점 성적 : B");
		break;
		default:
			score1 = 60;
			System.out.println("60점 성적 : C");
			
		}
	}

}
