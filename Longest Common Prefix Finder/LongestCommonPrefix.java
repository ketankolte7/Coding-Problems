public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }
        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(c);
        }
        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        String[] strs1 = {"light", "live", "liver"};
        System.out.println(longestCommonPrefix(strs1));
        String[] strs2 = {"light", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs2));
    }
}
