import java.util.*;

public class Name extends Department{
    @Override
    public int getDepartmentSize() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter department size: ");
        int size = s.nextInt();
        return size;
    }
}
