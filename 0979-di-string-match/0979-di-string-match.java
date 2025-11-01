class Solution {
    public int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];
        int low = 0;
        int high = result.length - 1;

        int index = 0;
        for (char element : s.toCharArray()) {
            if (element == 'I') {
                result[index] = low;
                low++;
            } else {
                result[index] = high;
                high--;
            }
            index++;
        }
        result[index] = high;

        return result;
    }
}