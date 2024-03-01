package dowlath.io.practice.dv;

public class FindSecondMaximumNumber {
    public static void main(String[] args) {
        int[] a = {13,34,2,34,33,1};
        int secondMax = findSecondMaximumNumber(a);
        System.out.println("The second maximum number .... : "+secondMax);
    }

    private static int findSecondMaximumNumber(int[] a) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i =0;i<a.length;i++){
            if(a[i] > max){
                secondMax = max;
                max = a[i];
            } else if(a[i] > secondMax && a[i] != max){
                secondMax = a[i];
            }
        }
        return secondMax;
    }
}
