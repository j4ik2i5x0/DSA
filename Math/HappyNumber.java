package Math;
import java.util.*;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int sum ;
        do{
            sum = 0;
            while (n > 0) {
                int lastDigit = n % 10;
                sum =  sum + (lastDigit * lastDigit);
                n = n / 10;
            }
            n = sum;
        } while(sum>9);

        if(sum == 1) System.out.println("Happy Happy :) ");
        else System.out.println("Not Happy :( ");


            sc.close();
        }

        
       
    }

