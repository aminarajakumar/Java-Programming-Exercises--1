package partE;

public class Overloading {

    public static void main(String args[]) {
        Person p1 = new Person();
        Person p2 = new Person("Amina");
        Person p3 = new Person("Amina", 19);
    }
}

class Person {
    String name;
    int age;
    Person() {
        System.out.println("Person Details");
    }
    Person(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}