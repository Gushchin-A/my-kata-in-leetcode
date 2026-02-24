class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, List<Integer>> sumAndGroups = new HashMap<>();

        int maxSizeGroup = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            if (sumAndGroups.get(sum) == null) {
                sumAndGroups.put(sum, new ArrayList<>(List.of(i)));
            } else {
                List<Integer> group = sumAndGroups.get(sum);
                group.add(i);
            }
            maxSizeGroup = Math.max(maxSizeGroup, sumAndGroups.get(sum).size());
        }
        
        int finalMaxSizeGroup = maxSizeGroup;
        
        return (int) sumAndGroups.values()
                .stream()
                .filter(value -> value.size() == finalMaxSizeGroup)
                .count();
    }
}