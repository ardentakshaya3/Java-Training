import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArray {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hi");
        stringList.add("Bye");
        stringList.add("Sleepy Head");
        Object[] stringArray = stringList.toArray();

        System.out.println("Array elements:");
        System.out.println(Arrays.toString(stringArray));
    }
}