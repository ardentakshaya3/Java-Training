import java.util.Arrays;
import java.util.Scanner;

public class VowelsSL {
    public static void main(String[] args){
        System.out.println("Enter strings");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] str=input.split(" ");
        Arrays.stream(str)
                .filter(s -> s.matches(".*[aeiouAEIOU]*."))
                .forEach(s -> {
                    long count = s.chars()
                            .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                            .count();
                    System.out.println("Number of vowels in " + s +" is " +count);
                });
    }
}