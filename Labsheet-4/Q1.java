
class Student {
    String name;
    int rollNumber;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Q1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Bhanu";
        s.rollNumber = 101;
        s.display();
    }
}
