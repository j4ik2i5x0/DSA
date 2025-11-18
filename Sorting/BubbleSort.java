package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before bubble sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(arr, n);
    }

    public static void bubble_sort(int[] arr, int n){
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            System.out.println("After bubble sort:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
        }
    
    }
}
