package dowlath.io.practice.arrays;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {
        printDuplicateCharacters("Basha");
    }

    private static void printDuplicateCharacters(String s) {

        if(s == null){
            System.out.println("Null String....");
            return;
        }

        if(s.isEmpty()){
            System.out.println("Empty String");
            return;
        }

        if(s.length() ==1){
            System.out.println("Single Character");
            return;
        }

        char words[] = s.toCharArray();
        Map<Character,Integer> characterMap = new HashMap<>();

        for(Character ch : words){
            if(characterMap.containsKey(ch)){
                characterMap.put(ch,characterMap.get(ch)+1);
            }else{
                characterMap.put(ch,1);
            }
        }

        //print the map
        Set<Map.Entry<Character,Integer>> entrySet = characterMap.entrySet();
        for(Map.Entry<Character,Integer> element : entrySet){
            if(element.getValue() > 1){
                System.out.println(element.getKey() + " : " + element.getValue());
            }
        }




}


}
