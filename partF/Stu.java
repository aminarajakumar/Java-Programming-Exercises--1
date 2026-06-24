package partF;

public class Stu {
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(105);
		s.setName("Amina");
		s.setDept("CY");
		
		System.out.println("Student ID: "+s.getId());
		System.out.println("Student Name: "+s.getName());
		System.out.println("Department: "+s.getDept());
		
	}
}
class Student{
	private int id;
	private String name;
	private String dept;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getDept(){
		return dept;
	}
}