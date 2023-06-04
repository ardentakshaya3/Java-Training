import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student s = new Student();
        s.setName("Akshaya");
        System.out.println("Student's name is "+s.getName());

        System.out.println("Product Class");
        //Product class
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        Double resultI, resultD;
        System.out.println("Enter price");
        Double price = sc.nextDouble();
        p.setPrice(price);
        resultI = p.getPrice(4);
        resultD = p.getPrice(5.8);
        System.out.println("Price with 4 is "+resultI);
        System.out.println("Price with 5.8 is "+resultD);

        System.out.println("RUn-time Poly");
        //Run-time polymorphism (Planet.java)
        Planet c= new Planet();
        Planet c1 = new First();
        Planet c2 = new Second();
        Planet c3 = new Third();
        c.printPlanet();
        c1.printPlanet();
        c2.printPlanet();
        c3.printPlanet();

        System.out.println("Department class");
        //Department assignment
        Name n = new Name();
        System.out.println(n.getDepartmentSize());



    }
}