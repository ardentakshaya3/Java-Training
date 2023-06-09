import java.util.Arrays;

public class CapitalizeSL {
    public static void main(String[] args) {
        String[] sports = {"badminton", "football", "basketball", "swimming", "golf"};
        Arrays.sort(sports);
        Arrays.stream(sports)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .forEach(System.out::println);
    }

}
