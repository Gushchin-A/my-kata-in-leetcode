class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> sumAndGroups = new HashMap<>();

        int maxSizeGroup = 0;
        for (int i = 1; i <= n; i++) {
            int sum = sumDigitsInNumber(i);
            sumAndGroups.merge(sum, 1, Integer::sum);
            maxSizeGroup = Math.max(maxSizeGroup, sumAndGroups.get(sum));
        }

        int result = 0;
        for (int size : sumAndGroups.values()) {
            if (size == maxSizeGroup) {
                result++;
            }
        }

        return result;
    }

    private int sumDigitsInNumber(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }
}