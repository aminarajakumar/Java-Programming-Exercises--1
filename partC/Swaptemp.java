package partC;

import java.util.Scanner;
/*public class Swap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1=sc.nextInt();
		System.out.print("Enter num2: ");
		int num2=sc.nextInt();
		System.out.println("Numbers before swapping:"+num1+","+num2);
		int a=num1+num2;
		int b=a-num1;
		int c=a-num2;
		System.out.println("Numbers after swapping:"+b+","+c);
		
	}

}
*/

public class Swaptemp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1=sc.nextInt();
		System.out.print("Enter num2: ");
		int num2=sc.nextInt();
		System.out.println("Numbers before swapping:"+num1+","+num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Numbers after swapping:"+num1+","+num2);
		
	}

}
