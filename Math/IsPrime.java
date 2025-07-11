package Math;

import java.util.*;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        boolean isPrime = false;
        
        if (n == 1) System.out.println("Neither Prime nor Composite");

        else if(n%2==0 && n!=2) System.out.println("Composite number");
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { 
                    isPrime = true;
                    break; 
                }
            }
            
            if (isPrime) {
                System.out.println("Not a Prime");
            } else {
                System.out.println("Prime");
            }
        }
        
        sc.close();
    }
}
    

