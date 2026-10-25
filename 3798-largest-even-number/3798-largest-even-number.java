class Solution {
    public String largestEven(String s) {
        StringBuilder result = new StringBuilder(s);
        int n = result.length();

        while (n != 0 && Character.getNumericValue(result.charAt(n - 1)) % 2 != 0) {
            result.setLength(n - 1);
            n = result.length();
        }

        return result.toString();
    }
}