import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String args[]){
        System.out.println("Enter string 1");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println("Enter string 2");
        String s2=sc.nextLine();
        if(s1.length()!=s2.length()){
            System.out.println("Not Anagram");
        }
        else{
            char[] arr1=s1.toCharArray();
            char[] arr2=s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean arr= Arrays.equals(arr1,arr2);
            if(arr){
                System.out.print("These are anagrams");
            }
            else{
                System.out.println("These are not anagrams");
            }
        }

    }
}