package dowlath.io.practice.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class MergeArrays {
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7,7};
        int arr2[] = {2,4,6,8};
        int arr3[] = mergeArrays(arr1,arr2);
        int[]  result = removeDuplcates(arr3);
        System.out.println(Arrays.toString(result));

    }

    public static int[] mergeArrays(int[] arr1,int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] result = new int[length];
        int pos = 0;
        for (int element : arr1) {
            result[pos] = element;
            pos++;
        }
        for (int element : arr2) {
            result[pos] = element;
            pos++;
        }
        Arrays.sort(result);
       /* List<Integer> list = Arrays.asList(result);
        List<Integer> distinctItems =*/
        return result;
    }

    public static int[] removeDuplcates(int[] a){
        Set<Integer> uniqueElements = new HashSet<>();
        for(int i=0;i<a.length;++i){
            uniqueElements.add(a[i]);
        }
        int index =0;
        for(int element : uniqueElements){
            a[index++] = element;
        }
        return a;
    }
}
