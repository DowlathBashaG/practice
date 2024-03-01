package dowlath.io.practice;

import java.util.Arrays;

public class DuplicateContains {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4};
        boolean isItDuplicate = duplicate(n);
        System.out.println("Is it Duplicate ..... : "+ isItDuplicate);
    }

    private static boolean duplicate(int[] n) {
        Arrays.sort(n);
        for (int i = 1; i < n.length; i++) {
            if (n[i] == n[i - 1]) {
                return true;
            }
        }
        return false;

    }
}