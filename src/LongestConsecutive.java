public class LongestConsecutive {
    public static void main(String[] args) {
        String str = "ABABCDEABCDEFGHABC";
        System.out.println(longestConsecutive(str));
    }
    public static String longestConsecutive(String str){
        String longest = "";
        String current = "" + str.charAt(0);
        for(int i = 1;i<str.length();i++){
            char prev = str.charAt(i-1);
            char curr = str.charAt(i);
            if(curr == prev +1){
                current += curr;
            }else{
                if(current.length()>longest.length()){
                    longest = current;
                }
                current = "" + curr;
            }
        }
        if(current.length()>longest.length()){
            longest = current;
        }
        return longest;
    }
}
