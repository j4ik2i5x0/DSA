package Array;

public class SmallestNo {
    public static void main(String[] args) {
        int[] arr = {2,4,2,1,6,2,4};
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if(i < min) min = i;
        }
        System.out.println(min);
    }
}
