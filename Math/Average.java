package Math;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd no: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd no: ");
        int c = sc.nextInt();

        double avg = (double)(a+b+c)/3;
        System.out.println(avg);


    }
}
