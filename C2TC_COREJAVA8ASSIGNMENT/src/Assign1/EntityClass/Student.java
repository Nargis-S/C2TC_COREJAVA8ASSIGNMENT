package Assign1.EntityClass;

public class Student {
    private int id;
    private String name;
    private String department;

    // Constructor
    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("ID: " + id + "; NAME: " + name + "; DEPARTMENT: " + department);
    }
}

