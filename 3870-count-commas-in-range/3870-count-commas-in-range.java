class Solution {
    public int countCommas(int n) {
        return n < 1_000 ? 0 : n - 999;
    }
}
