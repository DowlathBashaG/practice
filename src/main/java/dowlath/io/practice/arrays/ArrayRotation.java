package dowlath.io.practice.arrays;

import java.util.Arrays;

/*
       Formula ..... :  (i+K) % n  ..... Here i is iteration , K is rotation number and n is length of the array.
 */
public class ArrayRotation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ArrayRotation().solution(new int[]{7,2,8,3,5} , 2)));
    }

    private int[] solution(int[] A, int k) {
        int[] result = new int[A.length];
        for(int i=0;i<A.length;i++){
            result[(i+k) % A.length] = A[i];
        }
        return result;
    }
}
