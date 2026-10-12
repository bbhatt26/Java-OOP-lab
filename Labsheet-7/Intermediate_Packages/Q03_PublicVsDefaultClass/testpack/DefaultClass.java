package testpack;

// No 'public' modifier => package-private (default access)
class DefaultClass {
    void show() {
        System.out.println("DefaultClass: accessible only inside package testpack.");
    }
}
