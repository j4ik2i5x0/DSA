package Array;

public class CheckSortedArray{
    public static void main(String[] args) {
        int[] arr = {9,2,3,4,5,6};
        int[] nums = {3,2,2,3,6};

        System.out.println(checkSort(arr));
        System.out.println(checkSort(nums));
    }

    public static boolean checkSort(int[] arr){
        int l = arr.length;
        boolean result = true;
        int largest = arr[0];
        for(int i = 1; i <=l-1; i++){
            if(arr[i]<largest) {
                result = false;
                break;
            }
            largest = arr[i];
        }

        return result;

    }
}