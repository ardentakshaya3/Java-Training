import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AverageSL {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        OptionalDouble average=Arrays.stream(arr)
                .filter(s -> s % 2 != 0)
                .map(s -> s * s)
                .average();
        if (average.isPresent()) {
            System.out.println("Average of squares of odd numbers: " + average.getAsDouble());
        } else {
            System.out.println("No odd numbers available");
        }
    }
}