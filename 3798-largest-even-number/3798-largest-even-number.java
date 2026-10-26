class Solution {
    public String largestEven(String s) {
        int end = s.length();

        while (end != 0 && s.charAt(end - 1) != '2') {
            end--;
        }

        return s.substring(0, end);
    }
}