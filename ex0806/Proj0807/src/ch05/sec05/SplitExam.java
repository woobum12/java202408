package ch05.sec05;

public class SplitExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String board = "1,자바 학습,참조 탑입 String을 학습합니다.,홍길동";
		
		//문자열 분리
		String[] tokens = board.split(",");
		
		//인덱스별로 읽기
		System.out.println("번호" + tokens[0]);
		System.out.println("번호" + tokens[1]);
		System.out.println("번호" + tokens[2]);
		System.out.println("번호" + tokens[3]);
		System.out.println();
		
		//for 문을 이용한 읽기
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		System.out.println("-----------------------");
		
		//--- title 배열을 사용하여 이쁘게 만들어보자
		String[] title = {"번호", "제목", "내용", "성명"};
		
		for(int i=0; i<tokens.length; i++) {
			System.out.println(title[i] + ": " + tokens[i]);
		}
}
}
