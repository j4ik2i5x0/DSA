package Math;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int rev = 0, num = n;
        while( n > 0 ){
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }

        if( num == rev){
            System.out.println("Palindrome!!");
        } else{
            System.out.println("Not a Palindrow");
        }
        sc.close();

    }
}
