import java.util.*;

public class SortHashMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);
        sortHashMapByValue(scores);
    }

    public static Map<String,Integer> sortHashMapByValue(Map<String, Integer> scores){
        Map<String,Integer> sortedByValue = new HashMap<>();
        Set <Map.Entry<String,Integer>> entrySet = scores.entrySet();
        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(entrySet);
        entryList.sort((x,y)->x.getValue().compareTo(y.getValue()));
        System.out.println(entryList);
        for (Map.Entry<String,Integer> entry : entryList){
            sortedByValue.put(entry.getKey(),entry.getValue());
        }
        return sortedByValue;
    }
}
