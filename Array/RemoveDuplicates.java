package Array;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 5, 5, 7, 6, 6, 6};

        Set<Integer> set = new LinkedHashSet<>();  
        for (int num : nums) {
            set.add(num);
        }

        System.out.println("Number of unique elements: " + set.size());
        System.out.println("Unique elements:");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}

