package dowlath.io.practice;

import java.util.*;
import java.util.stream.Collectors;

/*
      1. Brute Force
      2. Hashset
      3. HashMap<K,V>
      4. Streams
 */
public class FindDuplicates {
    public static void main(String[] args) {

        String infra[] = {"Amazon","GCP","Azure","Amazon","Ali Baba","SauceLabs","Azure","GCP"};

        System.out.println(" **********  Brute Force ************");
        for(int i=0;i<infra.length;i++){
            for(int j=i+1;j<infra.length;j++){
                if(infra[i] == infra[j]){
                    System.out.println(infra[i]);
                }
            }
        }

        System.out.println(" *********  HashSet ***************");
        Set<String> data = new HashSet<>();
        for(String e : infra){
            if(data.add(e) == false){
                System.out.println(e);
            }
        }

        System.out.println("**********  HashMap ****************");
        Map<String,Integer> infraMap = new HashMap<>();
        for(String e : infra){
            Integer count = infraMap.get(e);
            if(count == null){
                infraMap.put(e,1);
            }else{
                infraMap.put(e,++count);
            }
        }

        // print all the duplcate elements
        Set<Map.Entry<String,Integer>> entrySet = infraMap.entrySet();
        for(Map.Entry<String,Integer> entry : entrySet){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }

        System.out.println("********** Stream ******************");
        Set<String> dataSet  = new HashSet<>();
        Set<String> dupSet= Arrays.asList(infra).stream().filter(e -> !dataSet.add(e)).collect(Collectors.toSet());
        System.out.println(dupSet);

        System.out.println("********* Streams using Frequency ************");
        List<String> list = Arrays.asList(infra);
        Set<String> elementList = list.stream().filter(e->Collections.frequency(list,e) > 1 ).collect(Collectors.toSet());
        System.out.println(elementList);



    }

}
