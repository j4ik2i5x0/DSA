package Math;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        // Print first two numbers
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        
        // Generate Fibonacci series
        for(int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        
        sc.close();
    }
}