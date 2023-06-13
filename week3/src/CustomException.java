import java.lang.Exception;

class CustomMessage extends Exception {
    public CustomMessage(String a) {
        super(a);
    }
}

public class CustomException {
    public static void main(String args[]) throws CustomMessage {
        try {
            System.out.println(2/0);
        }
        catch (Exception e) {
            throw new CustomMessage("Arithmetic Exception: Number not divisible by zero!");
        }
    }
}
