import java.util.Scanner;
public class Reverse {
    public static void main(String args[]) {
        int rev=0,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int a = sc.nextInt();
        while(a>0)
        {
            r=a%10;
            rev=(rev*10)+r;
            a/=10;
        }
       System.out.println(rev);
    }
}