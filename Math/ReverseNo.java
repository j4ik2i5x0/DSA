package Math;

import java.util.Scanner;

public class ReverseNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int n = sc.nextInt();
        int rev = 0;
        while(n > 0){
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit; 
            n = n / 10;
        }
        System.out.println("Reversed No :" + rev);
        sc.close();

    }
}

