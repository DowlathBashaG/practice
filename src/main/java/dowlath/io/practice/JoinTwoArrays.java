package dowlath.io.practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinTwoArrays {
    public static void main(String[] args) {
        String[] a = {"Dowlath","Basha","Ariz","Arsh"};
        String[] b = {"Salem","Tgode","Chennai","Ooty"};

        Stream<String> aStream = Arrays.stream(a);
        Stream<String> bStream = Arrays.stream(b);

        String fullSet[] = Stream.concat(aStream,bStream).toArray(size -> new String[size]);
        for(String s : fullSet){
            System.out.println(s);
        }
    }
}
