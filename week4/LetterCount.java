import java.util.HashMap;
import java.util.Map;

public class LetterCount {
    public static void getCount(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            if(c!=' ') {
                if (charCount.containsKey(c)) {
                    charCount.put(c, charCount.get(c) + 1);
                } else {
                    charCount.put(c, 1);
                }
            }

        }
        System.out.println();
        charCount.forEach((key, value) -> System.out.println(key + ":" + value));

    }

    public static void main(String[] args) {
        String str = "I am just sleepy";
        getCount(str);
    }
}