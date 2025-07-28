package Array;

public class MissingNo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = 5;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i <= n; i++) sum1+=i;
        for(int j = 0; j < arr.length; j++) sum2+=arr[j];
        System.out.println("Missing Number is: " + (sum1-sum2) ); 





        // brute force method
        // int flag;

        // for (int i = 1; i <= n; i++) {
        //     flag = 0;
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[j] == i) {
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if (flag == 0) {
        //         System.out.println("Missing number is: " + i);
        //         break; // You can break since only one number is missing
        //     }
        // }
    }
}
