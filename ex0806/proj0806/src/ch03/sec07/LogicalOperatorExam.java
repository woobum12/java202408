package ch03.sec07;

public class LogicalOperatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A';
		
//		아스키코드값이 65 ~ 90까지 적용되는 값이 대문자
		if( (65<=charCode) & (charCode<=90) ) {
			System.out.println("대문자이군요");
		}
//		아스키코드값이 97~122 소문자
		if( (97<=charCode) && (charCode<=122) ) {
			System.out.println("소문자이군요");
		}
//		아스키코드값이 48~57 숫자
		if ( (48<=charCode) && (charCode<=57) ) {
			System.out.println("0~9 숫자이군요.");
		}
		
		int value = 7;
//		2의배수는 2로 나누어서 떨어지는 값(나머지가 없음)
		if( (value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수이군요");
		}
		
		boolean result = (value%2==0) || (value%3==0);
		if(!result) {
			System.out.println("2 또는 3의 배수가 아니군요");
		}
	}

}
