public class L4 {
    public static void main(String[] args) {
        int visitors = 10;
        System.out.println("Initial: " + visitors);
        System.out.println("Visitor enters (prefix): " + (++visitors));
        System.out.println("Visitor enters (postfix): " + (visitors++));
        System.out.println("After entering: " + visitors);
        System.out.println("Visitor leaves (prefix): " + (--visitors));
        System.out.println("Visitor leaves (postfix): " + (visitors--));
        System.out.println("Final: " + visitors);
    }
}