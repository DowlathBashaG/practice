package dowlath.io.practice.td;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
       1. Burte-Force
       2. Sorting
       3. Hashing
 */
public class FindPairGivenSum {
    public static void main(String[] args) {
        int[] nums = { 8,7,2,5,3,1};
        int target = 10;

        // Burte-Force
        //findPairBurteForce(nums,target);

        // Sorting
        findPairSorting(nums,target);

        //Hashing
       // findPairHashing(nums,target);
    }


    // Burte-Force  ( O(n2) )
    private static void findPairBurteForce(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    System.out.printf("Pair found using Brute force method (%d,%d)",nums[i],nums[j]);
                    return;
                }
            }
     }
        System.out.println("Pair Not Found");
    }

    // Sorting   O(n.log(n))
    private static void findPairSorting(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        while(low < high){
            if(nums[low] + nums[high] == target){
                System.out.printf("Pair found using sorting (%d,%d)",nums[low],nums[high]);
                return;
            }
            if(nums[low] + nums[high] < target){
                low++;
            } else {
                high--;
            }
        }
        System.out.println("Pair Not Found");
    }

    private static void findPairHashing(int[] nums, int target) {
       Map<Integer, Integer> visitedNumbers = new HashMap<>();
       for(int i=0;i<nums.length;i++){
           int delta = target - nums[i];
           if(visitedNumbers.containsKey(delta)){
               System.out.printf("Pair found (%d,%d)",nums[i],nums[visitedNumbers.get(delta)]);
               return;
           }else{
               visitedNumbers.put(nums[i],i);
           }
       }
        System.out.println("Pair Not Found");
    }



}
