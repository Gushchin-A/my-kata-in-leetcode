class Solution {
    public String digitSum(String s, int k) {
        StringBuilder result = new StringBuilder(s);
        StringBuilder temp = new StringBuilder();

        int i = 0;
        while (result.length() > k) {
            if (i >= result.length()) {
                result = temp;
                temp = new StringBuilder();
                i = 0;
                continue;
            }

            String str = "";
            if (i + k < result.length()) {
                str = getSumDigitFromString(result.substring(i, i + k));
            } else {
                str = getSumDigitFromString(result.substring(i));
            }
            temp.append(str);
            i = i + k;
        }

        return result.toString();
    }

    private String getSumDigitFromString(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
        }

        return String.valueOf(sum);
    }
}
