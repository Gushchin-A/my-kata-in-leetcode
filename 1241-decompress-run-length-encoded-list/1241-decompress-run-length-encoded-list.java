class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                temp.add(val);
            }
            i = i + 1;
        }

        int[] result = new int[temp.size()];
        n = result.length;
        for (int i = 0; i < n; i++) {
            result[i] = temp.get(i);
        }

        return result;
    }
}