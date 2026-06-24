package partB;

public class Narrowing {
	public static void main(String[] args) {
		int n=10;
		byte n1=(byte)n;
		double a=105.7823;
		float a1=(float)a;
		long num=340;
		int num1=(int)num;
		System.out.println("Narrowing type conversion int to byte: "+n1);
		System.out.println("double to float: "+a1);
		System.out.println("long to int: "+num1);
	}
}
