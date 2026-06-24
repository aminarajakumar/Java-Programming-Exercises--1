package partA;

class Students {
    void display() {
        System.out.println("Student class method");
    }
}
class College {
    public static void main(String[] args) {
        Students s = new Students();
        s.display();
        System.out.println("Main method in College class");
    }
}