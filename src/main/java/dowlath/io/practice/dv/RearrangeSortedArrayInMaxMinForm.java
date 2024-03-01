package dowlath.io.practice.dv;

import java.util.Arrays;

/*

                Before re-arrange
                [2, 3, 5, 6, 8, 9]
                After re-arrange
                [9, 2, 8, 3, 6, 5]
 */
public class RearrangeSortedArrayInMaxMinForm {
    public static void main(String[] args) {
        int[] a = { 2,3,5,6,8,9};
        System.out.println("Before re-arrange");
        System.out.println(Arrays.toString(a));
        arrangeMaxMin(a);
    }

    private static void arrangeMaxMin(int[] a) {
        int maxIdx = a.length-1;
        int minIdx = 0;
        int max = a[maxIdx] + 1;
        for(int i = 0; i<a.length;i++){
            if( i%2 == 0 ){
                a[i] = a[i] + (a[maxIdx] % max) * max;
                maxIdx--;
            }else{
                a[i] = a[i] +(a[minIdx] % max) * max;
                minIdx++;
            }
        }
        for(int i=0;i<a.length;i++){
            a[i] = a[i] / max;
        }
        System.out.println("After re-arrange");
        System.out.println(Arrays.toString(a));

    }
}
