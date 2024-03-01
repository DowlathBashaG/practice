package dowlath.io.practice.td;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWith0Sum {
    public static void main(String[] args) {
        int[] nums = {4,-6,3,-1,4,2,7};
        if(hasZeroSumSubArray(nums)){
            System.out.println("SubArray exists");
        } else {
            System.out.println("SubArray does not exists ");
        }
    }

    private static boolean hasZeroSumSubArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;
        for(int value : nums){
            sum = sum+value;
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
