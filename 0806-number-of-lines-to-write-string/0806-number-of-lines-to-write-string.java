class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        final int maxCapacity = 100;
        int[] result = new int[2];

        int count = 0;
        int line = 1;
        int carry = 0;
        for (char c : s.toCharArray()) {
            int position = c - 'a';
            count += widths[position];

            if (count >= maxCapacity) {
                carry = count == maxCapacity ? 0 : widths[position];
                line++;
                count = carry;
            }
        }

        if (count == 0) {
            line--;
            count = maxCapacity;
        }

        result[0] = line;
        result[1] = count;

        return result;
    }
}