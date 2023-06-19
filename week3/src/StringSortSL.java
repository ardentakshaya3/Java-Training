import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StringSortSL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings");
        String input = scanner.nextLine();
        String[] str = input.split(" ");
        Arrays.stream(str)
                .sorted((s1, s2) -> {
                    if (s1.length() != s2.length()) {
                        return Integer.compare(s1.length(), s2.length());
                    } else {
                        return Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1));
                    }
                })
                .forEach(System.out::println);
    }
}