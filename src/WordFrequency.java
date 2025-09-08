import java.util.*;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        List<String> str = List.of("apple banana grape", "banana grape", "grape apple", "apple");
        System.out.println(countWordFrequency(str));
    }

// normal way
//    public static Map<String,Integer> countWordFrequency(List<String> str){
//        Map<String,Integer> map = new HashMap<>();
//        List<String> arrayList = new ArrayList<>();
//        for (int i = 0; i < str.size(); i++) {
//            String [] strArray = str.get(i).split(" ");
//            for (String s : strArray) {
//                arrayList.add(s);
//            }
//        }
//        for(String s: arrayList){
//            if(map.containsKey(s)){
//                map.put(s,map.get(s)+1);
//            }else{
//                map.put(s,1);
//            }
//        }
//        return  map;
//    }


    //using stream
    public static Map<String, Long> countWordFrequency(List<String> str) {
        return str.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))  // split each line into words
                .collect(Collectors.groupingBy(                               // group words
                        word -> word,
                        Collectors.counting()                               // count frequency
                ));
    }
}
