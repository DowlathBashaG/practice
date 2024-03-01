package dowlath.io.practice.td;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] a = { 0,1,2,2,1,0,0,2,0,1,1,0};
        threeWayPartition(a);
        System.out.println(Arrays.toString(a));
    }

    private static void threeWayPartition(int[] a) {
        int i = 0;
        int j = 0;
        int k = a.length-1;
        while( i<=k){
            if(a[i] == 0) {
                swap(a, i, j);
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

    private static void swap(int[] A,int i,int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}
