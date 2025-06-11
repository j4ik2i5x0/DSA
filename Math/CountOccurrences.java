package Math;
import java.util.*;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int limit = sc.nextInt();
        for(int i = 0; i <= limit; i++){
            int num = i;
            while(num > 0){
                int lastdigit = num % 10;
                if(lastdigit == 1){
                    System.out.println(i);
                    break;  // Break once we find a 1 in the number
                } 
                num = num / 10;
            }
        }
        sc.close();

    }
}
