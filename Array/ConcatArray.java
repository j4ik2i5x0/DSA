package Array;

public class ConcatArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = nums.length;
        int[] ans = new int[2*n];

        for(int i = 0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        for(int a: ans) System.out.print(a+" ");
    }
}
