class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int maxValue = 1_000;
        int offset = 1_000;
        int[] counts = new int[maxValue + offset + 1];


        for (int num : arr) {
            counts[num + offset]++;
        }

        Arrays.sort(counts);

        for (int i = 0; i < counts.length - 1; i++) {
            if (counts[i] != 0) {
                if (counts[i] == counts[i + 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}