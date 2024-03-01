package dowlath.io.practice.dv;

import java.util.Arrays;

public class Move0s1s2s {
    public static void main(String[] args) {
        int[] a = {0,0,1,2,0,1,2};
        move012s(a);
        System.out.println(Arrays.toString(a));

    }

    private static void move012s(int[] a) {
        int i = 0 , j = 0, k = a.length-1;
        while(i<=k){
            if(a[i] == 0){
                swap(a,i,j);
                i++;
                j++;
            } else if(a[i] == 1){
                i++;
            } else if(a[i] == 2){
                swap(a,i,k);
                k--;
            }

        }

    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
