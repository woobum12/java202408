package ch04.sec07;

public class BreakOutterExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower = 'a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
//					Outter 블록을 빠져나가라~
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
