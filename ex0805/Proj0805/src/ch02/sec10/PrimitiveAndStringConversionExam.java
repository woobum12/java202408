package ch02.sec10;

public class PrimitiveAndStringConversionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 :" + value1);
		System.out.println("value2 :" + value2);
		System.out.println("value3 :" + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1 + "=> 변수타입:" + str1.getClass().getName());
		System.out.println("str2: " + str2 + "=> 변수타입:" + str2.getClass().getName());
		System.out.println("str3: " + str3 + "=> 변수타입:" + str3.getClass().getName());
	}

}
