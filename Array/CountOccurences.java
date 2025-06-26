package Array;

public class CountOccurences {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,3,3,2,2,2,5,6,7,6,5,7,7,8,9,0};
        int target = 2;
        int count=0;
        for(int i: nums){
            if(i==target){
                count++;
            }
        }

        System.out.println(count);
    }
}
