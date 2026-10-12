package demo;

public class Access {
    public int pubVar = 1;
    protected int proVar = 2;
    int defVar = 3;            // default (package-private)
    private int priVar = 4;

    public void pubMethod()  { System.out.println("public method"); }
    protected void proMethod() { System.out.println("protected method"); }
    void defMethod()         { System.out.println("default method"); }
    private void priMethod() { System.out.println("private method"); }

    // Inside the same class, everything is accessible
    public void showAll() {
        System.out.println(pubVar + " " + proVar + " " + defVar + " " + priVar);
    }
}
