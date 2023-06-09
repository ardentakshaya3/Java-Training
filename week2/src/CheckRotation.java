import java.util.Scanner;

public class CheckRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2");
        String s2 = sc.nextLine();
        String s3 = "";
        if (s1.length() != s2.length()) {
            System.out.println("False");
        }
        else {
            s3 = s1 + s1;
            if (s3.contains(s2)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}