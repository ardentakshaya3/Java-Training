import java.util.Scanner;

public class Vowel {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        s=s.toUpperCase();
        int c=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'|| s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                c++;
            }
        }
        System.out.println("Count of vowels=" +c);
    }

}