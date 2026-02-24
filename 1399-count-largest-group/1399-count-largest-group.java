class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> sumAndGroups = new HashMap<>();

        int maxSizeGroup = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            sumAndGroups.merge(sum, 1, Integer::sum);
            maxSizeGroup = Math.max(maxSizeGroup, sumAndGroups.get(sum));
        }

        int finalMaxSizeGroup = maxSizeGroup;

        return (int) sumAndGroups.values()
                .stream()
                .filter(value -> value == finalMaxSizeGroup)
                .count();
    }
}