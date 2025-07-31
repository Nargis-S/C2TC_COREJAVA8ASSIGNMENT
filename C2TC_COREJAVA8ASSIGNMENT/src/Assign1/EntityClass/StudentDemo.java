package Assign1.EntityClass;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Nargis", "CSE");
        Student s2 = new Student(2, "Moggana", "IT");
        Student s3 = new Student(3, "Afrin", "ICB");

        System.out.println("STUDENT  DETAILS :");
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}

