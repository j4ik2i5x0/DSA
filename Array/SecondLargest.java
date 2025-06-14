package Array;

public class SecondLargest {
    public static void main(String[] args){
        int[] arr = {2,53,12,8,34,71,6};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i: arr){
            if(i>largest) {
                secondLargest = largest;
                largest = i;
            }
            else if(i>secondLargest && i!=largest){
                secondLargest = i;
            }
        }
        System.out.println("Largest number is: "+secondLargest);
    }
}
