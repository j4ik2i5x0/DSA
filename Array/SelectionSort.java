package Array;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        
        for(int i = 0; i <= arr.length-2; i++){
            int min = i;
            for(int j = i+1; j <= arr.length-1; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // Swap after finding the minimum
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int a: arr) System.out.print(a+" ");
    }
}
