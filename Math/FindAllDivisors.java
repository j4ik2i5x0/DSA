package Math;

import java.util.*;
public class FindAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum: "+ sum);
        sc.close();
    }
}
 