class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            int sum = 0;
            for (char c : word.toCharArray()) {
                sum += weights[c - 'a'];
            }
            int m = sum % 26;
            char reverse = (char) (25 - m + 'a');
            result.append(reverse);
        }
        
        return result.toString();
    }
}