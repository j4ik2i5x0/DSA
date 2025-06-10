package Math;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No: ");
        int n = sc.nextInt();
        int sum = 0;
        while( n > 0){
            int lastdigit = n % 10;
            sum += lastdigit;
            n = n / 10;
        }

        System.out.println("Sum of Digits: " + sum);
    }
}

