import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        Scanner s = new Scanner(System.in);
        Double resultI, resultD;
        System.out.println("Enter price");
        Double price = s.nextDouble();
        p.setPrice(price);
        resultI = p.getPrice(4);
        resultD = p.getPrice(5.8);
        System.out.println("Price with 4 is "+resultI);
        System.out.println("Price with 5.8 is "+resultD);
    }
}