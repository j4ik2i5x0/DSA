package Math;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(area(r));

    }
    public static float area(int r){
        float pie = 3.14f;
        float area = pie*(r*r);
        return area;
    }
}
