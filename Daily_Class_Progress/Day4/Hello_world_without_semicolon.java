package Day4;

public class Hello_world_without_semicolon {
    public static void main(String[] args) {
        if (System.out.printf("Hello World", "10m") != null) {
        }
        System.out.println();
        long num1 = 100 * 24 * 12 * 60 * 60 * 60L;
        System.out.println("long: " + num1);
    }

    // a=anything
    // b=anything
    // c=0
    int a = 23;
    int b = 324;
    int c = 0;
    int out = a * c + b * (1 - c);
}
