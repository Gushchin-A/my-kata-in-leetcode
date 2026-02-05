class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int maxValue = 1_000;
        int offset = 1_000;
        int[] counts = new int[maxValue + offset + 1];

        for (int num : arr) {
            counts[num + offset]++;
        }

        boolean[] seenCount = new boolean[arr.length + 1];
        for (int num : counts) {
            if (num != 0) {
                if (seenCount[num]) {
                    return false;
                }
                seenCount[num] = true;
            }
        }

        return true;
    }
}