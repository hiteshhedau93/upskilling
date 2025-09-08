import java.util.*;

public class TopKFrequentElement {
    public static void main(String[] args) {
        int[] nums = {6,7,7,7,6,5,5,5,5};
        int k = 1;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
    public static int[] topKFrequent(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
        Map<Integer,Integer> sortedValue = new LinkedHashMap<>();
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((y,x)-> y.getValue().compareTo(x.getValue()));
        for(Map.Entry<Integer,Integer> mapp : entryList){
            sortedValue.put(mapp.getKey(),mapp.getValue());
        }
        ArrayList<Integer> arrayList = new ArrayList<>( sortedValue.keySet());
        ArrayList<Integer> listt = new ArrayList<>();
        for(int i=1;i<=k;i++){
            listt.add(arrayList.get(arrayList.size()-i));
        }
        return listt.stream().mapToInt(Integer::intValue).toArray();
    }
}
