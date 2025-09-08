public class CheckPalindromUsingTwoPointers {
    public static void main(String[] args) {
        System.out.println(palindromCheck("madam"));
    }

    public static boolean palindromCheck(String str) {
        int start = 0;
        int end = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(end - i)) {
                return false;
            }
        }
        return true;
    }
}
