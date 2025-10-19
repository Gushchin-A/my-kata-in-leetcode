class Solution {
    public String[] divideString(String s, int k, char fill) {
        int resultLength = s.length() % k == 0 ? s.length() / k : s.length() / k + 1;
        String[] result = new String[resultLength];

        int resultIndex = 0;
        int start = 0;
        int end = k;
        while (start < s.length()) {
            StringBuilder temp = new StringBuilder();
            while (start < end) {
                if (start < s.length()) {
                    temp.append(s.charAt(start));
                    start++;
                } else {
                    temp.append(fill);
                    start++;
                }
            }
            result[resultIndex] = temp.toString();
            resultIndex++;
            start = end;
            end += k;
        }

        return result;
    
    }
}