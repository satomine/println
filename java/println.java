class Printlner {
    public static void println(Number x) {
        System.out.print(Math.log(x.doubleValue()));
    }
}

class Main {
    public static void main(String[] args) {
        Printlner.println(1);
        System.out.println();
 
        Printlner.println(2.0);
        System.out.println();
 
        // Out of domain
        Printlner.println(0);
        System.out.println();
 
        Printlner.println(-1);
        System.out.println();
    }
}
