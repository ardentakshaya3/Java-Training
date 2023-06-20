import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayTraversal {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hi");
        stringList.add("Bye");
        stringList.add("Sleepy Head");

        // 1. Using for loop
        System.out.println("For loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }
        System.out.println();

        // 2. Using enhanced for loop
        System.out.println("Enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }
        System.out.println();

        // 3. Using iterator
        System.out.println("Iterator:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        System.out.println();

        // 4. Using forEach
        System.out.println("forEach:");
        stringList.forEach(element -> System.out.println(element));
        System.out.println();

        // 5. Using parallel stream
        System.out.println("Parallel stream:");
        stringList.parallelStream().forEach(element -> System.out.println(element));
    }
}