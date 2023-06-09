import java.util.Scanner;

public class ReverseSentence {
    public static void main(String args[]) {
        System.out.println("Enter sentence");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] w = s.split(" ");
        String rev = "";
        for (int i = 0; i < w.length; i++) {
            String temp = w[i];
            String rw = "";
            for (int j = temp.length() - 1; j >= 0; j--) {
                rw = rw + temp.charAt(j);
            }
            rev = rev + rw + " ";
        }
        System.out.println(rev);
    }
}