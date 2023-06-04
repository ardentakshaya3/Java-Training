public class StaticDemo {
    public static int var;
    public static int func(int a){
        var = a;
        return var;
    }
    static {
        System.out.println(func(5));
    }
}
