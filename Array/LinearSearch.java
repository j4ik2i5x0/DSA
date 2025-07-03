package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {14, 72, 59, 80, 3, 14, 68, 25};
        int searchNo = 14;
        int cnt = 0;
        for(int i: arr){
            if(i == searchNo){
                cnt++;
            }
        }

        int[] arr1 = new int[cnt];
        int index = 0;
        for(int i = 0; i<arr.length; i++ ){
            if(arr[i] == searchNo){
                arr1[index++] = i;
            }
        }

        for(int i: arr1){
           System.out.print(i + " ");
        }
    }
}
