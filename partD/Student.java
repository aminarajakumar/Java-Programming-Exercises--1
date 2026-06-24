package partD;

public class Student{
	int studentId;
	String studentName;
	String department;
	Student(int studentId,String studentName,String department){
		this.studentId=studentId;
		this.studentName=studentName;
		this.department=department;
	}
	
	public void display() {
		
		System.out.println("Name: "+studentName+"\nId: "+studentId+
				"\nDepartment: "+department);
	}
	
	public static void main(String[] args) {
		Student s1=new Student(101,"Amina","CY");
		Student s2=new Student(102,"Akshaya","CY");
		Student s3=new Student(103,"Sowndharya","CY");
		Student s4=new Student(104,"Fameera","CY");
		System.out.println("Student Details");
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
		
		
	}
}
