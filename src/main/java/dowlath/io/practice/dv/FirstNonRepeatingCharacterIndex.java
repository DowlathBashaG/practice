package dowlath.io.practice.dv;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterIndex {
    public static void main(String[] args) {
        String s = "racecars";
        int nonRepeatCharacterIndex = nonRepeatingCharacterIndex(s);
        System.out.println("Non Repeating Character Index ... : "+ nonRepeatCharacterIndex);
    }

    private static int nonRepeatingCharacterIndex(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        for(char ch : chars){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<chars.length;i++){
            char ch = chars[i];
            if(map.get(ch) == 1){
                return i;
            }
        }
        return -1;
    }

}
