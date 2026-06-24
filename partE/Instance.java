package partE;
public class Instance {
    public static void main(String args[]) {
        Employee e = new Employee(101, "Amina");
        e.display();
    }
}
class Employee {
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}