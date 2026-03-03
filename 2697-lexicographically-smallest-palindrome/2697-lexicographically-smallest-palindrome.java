class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] tempResult = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (tempResult[i] != tempResult[j]) {
                char smallest = tempResult[i] < tempResult[j] ? tempResult[i] : tempResult[j];
                tempResult[i] = smallest;
                tempResult[j] = smallest;
            }
            i++;
            j--;
        }

        return new String(tempResult);
    }
}