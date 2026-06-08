class Solution {
    public int getLucky(String s, int k) {
        StringBuilder strNumber = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            strNumber.append(s.charAt(i) - 'a' + 1);
        }

        for (int i = 0; i < k; i++) {
            int sum = 0;
            StringBuilder tempSum = new StringBuilder();
            for (int j = 0; j < strNumber.length(); j++) {
                int digit = strNumber.charAt(j) - '0';
                sum += digit;
            }
            tempSum.append(sum);
            strNumber = tempSum;
        }

        return Integer.parseInt(strNumber.toString());
    }
}
