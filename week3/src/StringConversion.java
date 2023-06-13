import java.util.Scanner;

public class StringConversion {
    public static int[] convert(String s) {
        int[] res = new int[2];
        res[1]=0;
        try {
            int a = Integer.parseInt(s);
            res[0]=a;
            return res;
        }
        catch(Exception e) {
            System.out.println("NumberFormatException: Please give a proper string");
            res[1]=-1;
            return res;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string");
        String st = s.next();
        int[] a = convert(st);
        if(a[1]==0)
            System.out.println(a[0]);
    }
}