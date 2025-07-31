package Assign1.EntityClass1;

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 750);
        Product p2 = new Product(2, "Smartphone", 350);
        Product p3 = new Product(3, "Tablet", 220);
        Product p4 = new Product(4, "Headphones", 50);

        System.out.println("Product Details:");
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
        p4.displayDetails();
    }
}


