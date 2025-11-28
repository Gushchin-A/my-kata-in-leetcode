class Solution {
    public char kthCharacter(int k) {
        StringBuilder result = new StringBuilder();
        result.append("a");

        int i = 0;
        while (i < k) {
            if (result.length() >= k) {
                return result.charAt(k - 1);
            }
            StringBuilder temp = new StringBuilder();
            int j = 0;
            while (j < result.length()) {
                int number = result.charAt(j) - 'a' + 1;
                char nextChar = (char) ('a' + number);
                temp.append(nextChar);
                j++;
            }
            result.append(temp);
            i++;
        }
        
        return result.charAt(k - 1);   
    }
}