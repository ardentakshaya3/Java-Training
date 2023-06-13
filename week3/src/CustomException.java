import java.lang.Exception;
import java.util.Scanner;

class SameName extends Exception
{
    public SameName(String message)
    {
        super(message);
    }
}

class CustomMessage {
    String fn, ln;
    public CustomMessage(String a, String b) {
        this.fn = a;
        this.ln=b;
    }
    public String check() throws SameName{
//        System.out.println(this.fn.equals(this.ln));
        if(this.fn.equals(this.ln))
            throw new SameName("First name and last name are similar. Enter again!ss");
        else
            return fn+" "+ln;
    }

}

public class CustomException {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first name");
        String fn = s.nextLine();
        System.out.println("Enter last name");
        String ln = s.nextLine();
        CustomMessage cm = new CustomMessage(fn,ln);
        try {
            String st = cm.check();
            System.out.println(st);
        }
        catch (SameName e) {
            e.printStackTrace();
        }

    }
}
