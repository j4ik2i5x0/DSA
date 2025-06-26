package Math;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            int rev = 0, num = i, j = i;

            while( j > 0 ){
                int lastdigit = j % 10;
                rev = (rev * 10) + lastdigit;
                j = j / 10;
            }

            if(num == rev){
                cnt++;
                System.out.println(num +" is Palindrome!");
            }
        }

        System.out.println(cnt);
        sc.close();

    }
}
