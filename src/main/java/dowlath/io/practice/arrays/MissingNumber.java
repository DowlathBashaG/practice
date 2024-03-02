package dowlath.io.practice.arrays;

/*
     Formula : x * (x+1) / 2
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] a = { 1,2,5,3};
        int missingNumber = missingNumber(a);
        System.out.println("Missing Number ... : "+ missingNumber);
    }

    private static int missingNumber(int[] a) {
        long actualNumber = 0;
        for(int n : a){
            actualNumber+=n;
        }

        int maxLength = a.length+1;
        int expectedNumber = (maxLength * (maxLength+1)/2);
        return (int)(expectedNumber - actualNumber);
    }
}
