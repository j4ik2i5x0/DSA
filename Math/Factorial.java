package Math;

import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int limit = sc.nextInt();
        int fact = 1;
        if(limit == 1){
            System.out.println("Factorial:" + limit);
        } 
        else if(limit == 0){
            System.out.println("Factorial: 1");
        }
        else if(limit < 0){
            System.out.println("Error! Negative Number");
        }

        else{
            for(int i = 2; i <= limit; i++){
                fact *= i;
            }
        System.out.println("Factorial: " + fact);
        }
        sc.close();

    }

}