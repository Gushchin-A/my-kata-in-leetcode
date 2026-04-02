class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() % k == 0) {
                sum += entry.getKey() * entry.getValue();
            }
        }

        return sum;
    }
}