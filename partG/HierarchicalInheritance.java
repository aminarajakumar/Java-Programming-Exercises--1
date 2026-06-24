package partG;

public class HierarchicalInheritance {
    public static void main(String args[]) {

        Student s = new Student();
        Faculty f = new Faculty();

        System.out.println("Student Details");
        s.showPerson();
        s.showStudent();

        System.out.println("Faculty Details");
        f.showPerson();
        f.showFaculty();
    }
}

class Person {
    void showPerson() {
        System.out.println("Person Class");
    }
}

class Student extends Person {
    void showStudent() {
        System.out.println("Student Class");
    }
}

class Faculty extends Person {
    void showFaculty() {
        System.out.println("Faculty Class");
    }
}