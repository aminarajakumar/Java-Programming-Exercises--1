package partE;

public class Constructor{
	public static void main(String args[]) {
		Detail d=new Detail("Amina",19);
		System.out.println("Name: " + d.name);
        System.out.println("Age: " + d.age);
	}
}

class Detail {
	String name;
	int age;
	public Detail(String name,int age) {
		this.name=name;
		this.age=age;
	}

}
