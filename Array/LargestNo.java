package Array;

public class LargestNo{
    public static void main(String[] args){
        int[] arr = {2,53,12,8,34,71,6};
        int largest = Integer.MIN_VALUE;
        for(int i: arr){
            if(i>largest) largest = i;
        }
        System.out.println("Largest number is: "+largest);
    }
}
