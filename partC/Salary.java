package partC;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Basic Salary: ");
		long salary=sc.nextLong();
		double hra=salary*0.20;
		double da=salary*0.10;
		double tax=salary*0.05;
		System.out.println("Salary Slip");
		System.out.println("Basic Salary: "+salary);
		System.out.println("HRA: "+hra);
		System.out.println("DA: "+da);
		System.out.println("Tax: "+tax);
		
	}
}
