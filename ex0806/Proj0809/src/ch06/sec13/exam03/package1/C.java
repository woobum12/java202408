package ch06.sec13.exam03.package1;

import ch06.sec13. exam03.package1.*;

public class C {
	public C() {
//		객체 생성
		A a = new A();
		
//		필드값 변경
		a.field1 = 1; //o
		a.field2 = 1; //o
		a.field3 = 1; //x priva
	}
}
