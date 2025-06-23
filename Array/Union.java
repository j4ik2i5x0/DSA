package Array;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5,8};
        int[] arr2 = {2,3,4,4,5,7,6};
        

        HashSet<Integer> uni = new HashSet<>();

        for(int i: arr1){
            uni.add(i);
        }

        for(int j : arr2){
            uni.add(j);
        }

        for(int k: uni){
            System.out.print(k+" ");
        }
    }
}
