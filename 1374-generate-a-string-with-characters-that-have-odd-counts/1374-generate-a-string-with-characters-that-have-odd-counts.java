class Solution {
    public String generateTheString(int n) {
        String[] result = new String[n];
        Arrays.fill(result, "a");

        if (n % 2 == 0) {
            result[0] = "b";
        }

        return String.join("", result);
    }
}