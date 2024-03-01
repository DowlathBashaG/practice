package dowlath.io.practice.td;

import java.util.stream.IntStream;

public class FindDuplicateLimitedRangeArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,4};
        System.out.println("The duplicate element is .... : "+ findDuplicate(num));
        System.out.println("The duplicate element for BurteForce Method .... : "+ findDuplicateBruteForce(num));
    }

    public static int findDuplicate(int[] n){
        int acutalSum = IntStream.of(n).sum();
        int expectedSum = n.length * (n.length-1)/2;
        return acutalSum - expectedSum;
    }

    public static int findDuplicateBruteForce(int[] n){
        boolean[] visited = new boolean[n.length+1];
        for(int value : n){
            if(visited[value]){
                return value;
            }
            visited[value] = true;

        }
        return -1;
    }
}
