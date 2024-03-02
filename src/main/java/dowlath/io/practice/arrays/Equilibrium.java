package dowlath.io.practice.arrays;

public class Equilibrium {
    public static void main(String[] args) {
        System.out.println(new Equilibrium().solution(new int[] {3,1,2,4,3}));
    }

    private int solution(int[] A) {
        int leftSum = A[0];
        int rightSum = 0;
        for(int x : A){
            rightSum = rightSum+x;
        }
        rightSum = rightSum-leftSum;

        int diff = Math.abs(leftSum - rightSum);
        for(int i=1;i<A.length-1;i++){
            leftSum = leftSum + A[i];
            rightSum = rightSum - A[i];
            int currentDiff = Math.abs(leftSum - rightSum);
            if(diff > currentDiff) diff = currentDiff;
        }
        return diff;
    }
}
