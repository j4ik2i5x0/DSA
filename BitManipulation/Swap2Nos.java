package BitManipulation;

public class Swap2Nos {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a + " b = " + b);
    }
}
