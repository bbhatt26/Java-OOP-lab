import testpack.PublicClass;
// import testpack.DefaultClass;   // ERROR: testpack.DefaultClass is not public in testpack;
//                                 // cannot be accessed from outside package

public class Main {
    public static void main(String[] args) {
        PublicClass p = new PublicClass();
        p.show();                          // works

        // DefaultClass d = new DefaultClass();   // Compile-time error:
        // d.show();                              // class is not visible outside its package

        System.out.println("Observation: the public class is accessible; the default class is not.");
        System.out.println("Uncomment the DefaultClass lines above to see the compile error.");
    }
}
