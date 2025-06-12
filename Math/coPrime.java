package Math;

import java.util.*;


public class coPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int result = Gcd(n1,n2);
        if(result == 1){
            System.out.println("Co-primes");
        }
        else{
            System.out.println("Not a Co-prime");
        }   
        sc.close(); 
    }

    public static int Gcd(int x, int y){
        while(y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

}
