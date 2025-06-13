package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {14, 72, 59, 80, 3, 44, 68, 25};
        int searchNo = 3;
        for(int i: arr){
            if(i == searchNo){
                System.out.println("Found the num: "+i);
            }
        }
    }
}
