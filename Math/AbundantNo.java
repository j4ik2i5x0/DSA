package Math;

import java.util.Scanner;

public class AbundantNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n%i==0)  sum+=i; 
        }
        String result = sum>n ? "Abundant no" : "Not an Abundant no";
        System.out.println(result);
    }
}
