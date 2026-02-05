class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);

        Set<Integer> uniqCounts = new HashSet<>();
        
        int count = 0;
        boolean endDuplicates = false;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length) {
                if (arr[i] != arr[i + 1]) {
                    count++;
                    endDuplicates = true;
                } else {
                    count++;
                }
            } else {
                count++;
                if (!uniqCounts.add(count)) {
                    return false;
                }
            }

            if (endDuplicates) {
                if (!uniqCounts.add(count)) {
                    return false;
                }
                endDuplicates = false;
                count = 0;
            }
        }

        return true;
    }
}