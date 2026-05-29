class Solution {
    public int sumBase(int n, int k) {
        String tempNumToBase = Integer.toString(n, k);
        int tempNum = Integer.parseInt(tempNumToBase);

        int sum = 0;
        while (tempNum > 0) {
            sum += tempNum % 10;
            tempNum /= 10;
        }

        return sum;
    }
}