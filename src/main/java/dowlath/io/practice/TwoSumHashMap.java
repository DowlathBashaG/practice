package dowlath.io.practice;

import java.util.HashMap;

public class TwoSumHashMap {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int[] result = twoSumCalculation(nums,target);
        for(int i=0;i<result.length;i++){
            System.out.println(" "+result[i]);
        }
    }

    private static int[] twoSumCalculation(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i])){
                output[0] = hashMap.get(nums[i]);
                output[1] = i;
                return output;
            }
            hashMap.put(target-nums[i],i);
        }
        return output;
    }


}
