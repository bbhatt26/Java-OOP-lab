import demo.Access;

// A subclass in a DIFFERENT package can access protected members through inheritance
class Child extends Access {
    void test() {
        System.out.println("Child (subclass) accessing protected proVar = " + proVar);
        proMethod();
        // System.out.println(defVar);   // ERROR: not visible outside package
        // System.out.println(priVar);   // ERROR: private
    }
}

public class Main {
    public static void main(String[] args) {
        Access a = new Access();

        // Non-subclass, different package:
        System.out.println("public variable  : " + a.pubVar);   // OK
        a.pubMethod();                                          // OK
        // System.out.println(a.proVar);  // ERROR: protected not accessible here
        // System.out.println(a.defVar);  // ERROR: default not accessible here
        // System.out.println(a.priVar);  // ERROR: private not accessible here

        new Child().test();
        a.showAll();

        System.out.println("\nSummary (outside package):");
        System.out.println("public    -> accessible");
        System.out.println("protected -> only via subclass");
        System.out.println("default   -> NOT accessible");
        System.out.println("private   -> NOT accessible");
    }
}
