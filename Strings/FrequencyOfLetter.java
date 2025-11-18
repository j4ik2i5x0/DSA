package Strings;

import java.util.*;

public class FrequencyOfLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "takeyouforwarddd";
        Printfrequency(str1);
    }

    public static void Printfrequency(String str) {
        int[] freq = new int[26];  

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                int pos = ch - 'a'; 
                freq[pos]++;
            }
        }


        for (int i = 0; i < 26; i++) {
            
                System.out.print((char)(i + 'a') + "-" + freq[i]+" ");
            
        }
    }
}
