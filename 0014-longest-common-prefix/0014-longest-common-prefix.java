class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            boolean samePrefix = strs[i].startsWith(prefix);
            
            while (!samePrefix) {
                prefix = prefix.substring(0, prefix.length() - 1);
                samePrefix = strs[i].startsWith(prefix);
                if (prefix.equals("")) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
