class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, List<Integer>> sumAndGroups = new HashMap<>();

        int maxSizeGroup = 0;
        for (int i = 1; i <= n; i++) {
            int sum = sumDigitsInNumber(i);
            if (sumAndGroups.get(sum) == null) {
                sumAndGroups.put(sum, new ArrayList<>(List.of(i)));
            } else {
                List<Integer> group = sumAndGroups.get(sum);
                group.add(i);
            }
            maxSizeGroup = Math.max(maxSizeGroup, sumAndGroups.get(sum).size());
        }

        int result = 0;
        for (List<Integer> group : sumAndGroups.values()) {
            if (group.size() == maxSizeGroup) {
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