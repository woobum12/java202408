package ch05.sec05;

public class ReplaceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "Java");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
