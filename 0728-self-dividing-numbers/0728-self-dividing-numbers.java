class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)) {
                result.add(i);
            }
        }

        return result;
        
    }

    private boolean isSelfDividingNumber(int n) {
        int original = n;

        while (n > 0) {
            if (n % 10 == 0 || original % (n % 10) != 0) {
                return false;
            }
            n /= 10;
        }

        return true;
    } 
}
