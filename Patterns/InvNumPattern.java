package Patterns;

public class InvNumPattern {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = i, a = 1; j <= n; j++){
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }
}
