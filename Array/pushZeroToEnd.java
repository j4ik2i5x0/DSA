package Array;

public class pushZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void pushZerosToEnd(int[] arr){
        int nonZeroIndex = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
