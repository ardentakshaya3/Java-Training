import java.util.*;
public class PersonType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of person");
        int age = sc.nextInt();
        if (age > 0) {
            if (age < 13)
                System.out.println("Person is kid");
            else if (age >= 13 && age <= 19)
                System.out.println("Person is teen");
            else
                System.out.println("Person is adult");
        }
        else
            System.out.println("Invalid age");
    }
}