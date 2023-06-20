import java.util.ArrayList;
import java.util.List;

public class RemoveLast {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Bye");
        list.add("Sleepy Head");
        System.out.println("Before removal: " + list);

        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
            System.out.println("After removal: " + list);
        } else {
            System.out.println("ArrayList is empty");
        }
    }
}