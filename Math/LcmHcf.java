package Math;

import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = a * b / Gcd(a,b);
        System.out.println("HCF: " + Gcd(a,b));
        System.out.println("LCM: " + lcm);
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
