class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        boolean[] seenCount = new boolean[arr.length + 1];

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (seenCount[count]) {
                    return false;
                }
                seenCount[count] = true;
                count = 1;
            }
        }

        if (seenCount[count]) {
            return false;
        }

        return true;
    }
}