package Math;
import  java.util.*;
public class PermutationCombination{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int numerator = fact(n);
        int denominator1 = fact(n-r);
        int denominator2 = fact(r);
        int permutation = (int)(numerator / denominator1);
        System.out.println("Permutation: "+permutation);
        int combination = (int)(numerator/(denominator2*denominator1));
        System.out.println("Combination: "+combination);
    }
    public static int fact(int n){
        int fact = 1;
        while(n>0){
            fact *= n;
            n--;
        }
        return fact;
    }
}