class Solution {
    public String reverseStr(String s, int k) {
        char[] array = s.toCharArray();
        int n = array.length;

        for (int start = 0; start < n; start += 2 * k) {
            int left = start;
            int right = Math.min(start + k - 1, n - 1);

            while (left < right) {
                char temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        return new String(array);
    }
}