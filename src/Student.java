public class Student {
    private String name;
    private double gpa;

    public Student(String n, double g) {
        name = n;
        gpa = g;
    }

    public void introduce() {
        System.out.println("My name is " + name + " and my gpa is " + gpa);
    }
}
