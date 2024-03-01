package dowlath.io.practice.td;

import java.util.HashMap;
import java.util.Map;

public class FindThePairUsingHashMap {
    public static void main(String[] args) {
        int[] nums = {8,7,2,5,3,1};
        int target = 10;
        int[] result = findPair(nums,target);
        System.out.println(result[0] +" "+ result[1]);

    }

    private static int[] findPair(int[] nums, int target) {
        Map<Integer,Integer> visitedNumbers = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int delta = target - nums[i];
            if(visitedNumbers.containsKey(delta)){
                return new int[] { i,visitedNumbers.get(delta)};
            } else {
                visitedNumbers.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};

    }
}
