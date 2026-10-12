public class QualifiedDemo {
    public static void main(String[] args) {
        animals.Dog obj = new animals.Dog();   // (b) fully qualified name, no import
        obj.bark();

        /* Comparison:
           (a) import  : write once, use short name everywhere; cleaner code.
           (b) qualified: no import needed; useful when two packages have a class with the
               same name (e.g. java.util.Date and java.sql.Date) but verbose. */
    }
}
