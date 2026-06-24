package partD;

public class Employee {
	int empId;
	String empName;
	long salary;
	
	Employee(int empId,String empName,long salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	public void display() {
		System.out.println("ID: "+empId+"\nName: "+empName+"\nSalary: "
	+salary);
	}
	public static void main(String arg[]) {
		Employee e1=new Employee(1001,"Amina",30000);
		Employee e2=new Employee(1002,"Akshaya",28000);
		Employee e3=new Employee(1003,"Sowndharya",35000);
		Employee e4=new Employee(1004,"Fameera",40000);
		System.out.println("Employee Details");
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		
	}
}
