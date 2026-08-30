class Solution {
    public int findShortestSubArray(int[] nums) {
        int n = nums.length;
        int[] freq = new int[50_000];

        for (int num : nums) {
            freq[num]++;
        }

        int maxCount = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
            }
        }

        int[] tempCandidateElements = new int[n];
        int indexRes = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxCount) {
                tempCandidateElements[indexRes++] = i;
            }
        }

        int[] candidateElements = Arrays.copyOf(tempCandidateElements, indexRes);

        int minSubarray = n;
        for (int element : candidateElements) {

            int left = 0;
            while (nums[left] != element) {
                left++;
            }

            int right = n - 1;
            while (nums[right] != element) {
                right--;
            }

            minSubarray = Math.min(minSubarray, right - left + 1);

            if (minSubarray == maxCount) {
                return minSubarray;
            }
        }

        return minSubarray;
    }
}
