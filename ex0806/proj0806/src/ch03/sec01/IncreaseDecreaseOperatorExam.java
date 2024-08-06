package ch03.sec01;

public class IncreaseDecreaseOperatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		
		x++; // x = 10
			 // x = 11
		++x; // x = 12
		System.out.println("x= " + x);
		
		System.out.println("------------------");
		y--; // y = 10
			 // y = 9
		--y; // y = 8
		System.out.println("y= " + y);
		
		System.out.println("------------------");
		z = x++; // z = x
				 // z=12, x=13
		System.out.println("z= " +z);
		System.out.println("x= " +x);
		
		System.out.println("------------------");
		z = ++x; // x=14 , z=14  
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("------------------");
		z = ++x + y++; // z= 15(x) + 8 = 23
					   // y= 9
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}

}
