class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;

        for (String str : strs) {
            int candidate = digitsValueOrlengthInStr(str);
            max = Math.max(max, candidate);
        }

        return max;
    }

    private int digitsValueOrlengthInStr(String str) {
        int result = 0;
    
        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return str.length();
        }

        return result;
    }
}
