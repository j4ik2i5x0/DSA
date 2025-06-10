package Math;
import java.util.*;
public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int armno = 0;
        int num = n;

        while(n>0){
            int lastdigit = n % 10;
            armno = armno + (lastdigit*lastdigit*lastdigit);
            n = n / 10;
        }

        if(armno == num){
            System.out.println("Armstrong Number!");
        } else{
            System.out.println("Not an Armstrong Number!");
        }

    }
}