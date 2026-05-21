class Solution {
    public int smallestEvenMultiple(int n) {
        boolean isSmalltest = false;
        
        while (!isSmalltest) {
            if (n % n == 0 && n % 2 == 0) {
                isSmalltest = true;
            } else {
                n += n;
            }
        }

        return n;
    }
}