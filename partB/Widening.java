package partB;

public class Widening {
	public static void main(String[] args) {
		short n=10;
		int n1=n;
		float a=10.325f;
		double a1=a;
		int num=250;
		long num1=num;
		System.out.println("Widening type conversion short to int: "+n1);
		System.out.println("int to long: "+num1);
		System.out.println("float to double: "+a1);
	}

}
