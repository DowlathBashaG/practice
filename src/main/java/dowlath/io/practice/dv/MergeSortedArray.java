package dowlath.io.practice.dv;

import java.util.Arrays;



public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a = {2,5,6,7};

        int[] b = {3,4,5,9};

        int[] result = mergeSortedArray(a,b,a.length,b.length);
        printedArray(result);

    }

    private static void printedArray(int[] result) {
        int n = result.length;
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }

    private static int[] mergeSortedArray(int[] a, int[] b, int n, int m) {

        int[]  result = new int[n+m];

        int i=0,j=0, k=0;

        while(i<n && j<m){

            if(a[i] < b[j]){

                result[k] = a[i];
                i++;

            }else {

                result[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<n){
            result[k] = a[i];
            i++;k++;
        }
        while(j<m){
            result[k] = b[j];
            j++;k++;
        }
        return result;
    }
}
