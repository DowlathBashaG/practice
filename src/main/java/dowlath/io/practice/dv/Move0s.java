package dowlath.io.practice.dv;

import java.util.Arrays;

public class Move0s {
    public static void main(String[] args) {
        int[] a = { 1,2,0,2,0,4,0,0,1};
        move0s(a);
        System.out.println(Arrays.toString(a));
    }

    private static void move0s(int[] a) {
        int n = a.length;
        int j =0;
        for(int i=0;i<n;i++){
            if(a[i] != 0 && a[j] ==0){
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
            if(a[j]!=0){
                j++;
            }
        }
    }
}
