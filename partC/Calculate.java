package partC;

import java.util.Scanner;

public class Calculate {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter subject1 marks: ");
		int mark1=sc.nextInt();
		System.out.print("Enter subject2 marks: ");
		int mark2= sc.nextInt();
		System.out.print("Enter subject3 marks: ");
		int mark3= sc.nextInt();
		System.out.print("Enter subject4 marks: ");
		int mark4= sc.nextInt();
		System.out.print("Enter subject5 marks: ");
		int mark5= sc.nextInt();
		int total=mark1+mark2+mark3+mark4+mark5;
		double average=total/5;
		System.out.println("Total marks: "+total);
		System.out.println("Average marks: "+average);
		System.out.println("Percentage: "+average+"%");
		sc.close();
		
		
		
		
		
	}

}
