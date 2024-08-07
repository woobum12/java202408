package ch04.sec05;

import java.util.Scanner;

public class KeyControlExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		스캐너 생성
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------");
			System.out.print("선택: ");
			
//			스캐너값을 입력받아서 strNum변수에 값을 넣는다
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				speed ++;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("3")) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
