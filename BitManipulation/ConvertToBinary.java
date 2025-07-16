package BitManipulation;

public class ConvertToBinary {
    public static void main(String[] args) {
        int number = 15;
        System.out.println("Binary of " + number + " is: " + toBinary(number));
    }

    public static String toBinary(int n) {
        if (n == 0) return "0";
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary; 
            n = n / 2;
        }
        return binary;
    }
}
