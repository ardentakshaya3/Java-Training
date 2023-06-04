public class Child extends Parent{
    String child_var;

    Child() {
        child_var = "This is Child class var";
        super.parent_var = "This is Parent class var";
        System.out.println(child_var+"\n"+super.parent_var);
    }

    Child (String s) {
        child_var = s;
        System.out.println("\n"+child_var);
    }

}
