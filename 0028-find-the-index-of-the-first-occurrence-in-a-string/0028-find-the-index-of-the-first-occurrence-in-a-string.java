class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if (needleLength == 0) {
            return 0;
        }

        if (needleLength > haystackLength) {
            return -1;
        }

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            int matched = 0;
            for (int j = 0; j < needleLength; j++) {
                if (haystack.charAt(i +j) != needle.charAt(j)) {
                    break;
                }
                matched++;
            }
            if (matched == needleLength) {
                return i;
            }
        }

        return -1;
    }
}
