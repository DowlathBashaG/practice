package dowlath.io.practice.arrays;

import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] a = {10,23,22,11,16,89,65,23,67,55,44};
        int kthElement = kThLargestElement(a,5);
        System.out.println(kthElement);

    }

    private static int kThLargestElement(int[] a, int i) {
        Arrays.sort(a);
        return a[a.length-i];
    }
}
