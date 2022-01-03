import com.sun.corba.se.impl.orb.ParserTable;

public class testClass {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(ParserTable.TestAcceptor1.class);
        Main main = new Main("Name");
        System.out.println("my new text from stash");
        System.out.println(Math.class.getClass());
    }

}
