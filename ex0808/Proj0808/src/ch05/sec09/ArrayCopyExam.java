package ch05.sec09;

public class ArrayCopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		길이 3인 배열
		String[] oldStrArray = { "Java", "array", "copy"};
//		길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
//		배열 항목 복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//		배열 항목 출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}

}
