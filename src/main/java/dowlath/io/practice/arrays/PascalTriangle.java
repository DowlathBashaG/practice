package dowlath.io.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = geneate(numRows);
        System.out.println(result);
    }

    private static List<List<Integer>> geneate(int numRows) {
        List<List<Integer>> output= new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        for(int i = 0; i<numRows;i++){
            cur.add(0,1);
            for(int x=1;x<cur.size()-1;x++){
                cur.set(x,cur.get(x) + cur.get(x+1));
            }
            output.add(new ArrayList<>(cur));
        }
        return output;
    }
}
