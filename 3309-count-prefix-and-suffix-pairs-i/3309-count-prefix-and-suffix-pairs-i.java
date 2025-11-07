class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isPrefixAndSuffix(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return false;
        }

        int n = str1.length();
        int left = 0;
        int RightStr1 = str1.length() - 1;
        int RightStr2 = str2.length() - 1; 
        while (left < n) {
            if (str1.charAt(left) != str2.charAt(left) ||
            str1.charAt(RightStr1) != str2.charAt(RightStr2)) {
                return false;
            }
            left++;
            RightStr1--;
            RightStr2--;
        }

        return true;
    }
}