package Math;

import java.util.Scanner;

public class Countnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            n = n / 10;  // Divide by 10 to remove last digit
            count++;
        }
        System.out.println("Number of digits: " + count);
        sc.close();

    }
}