package Array;

public class RotateArr {
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
            int d = 2;

            reverseArr(arr, 0, arr.length-1);
            reverseArr(arr, 0, d-1);
            reverseArr(arr, d, arr.length-1);

            for(int a: arr) System.out.print(a + ", ");
        }

        public static int[] reverseArr(int[] arr, int l, int r){
            
            while(l<=r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            return arr;
        }
    }
    



