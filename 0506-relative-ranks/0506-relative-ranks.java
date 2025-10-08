class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] sortScore = Arrays.copyOf(score, score.length);
        Arrays.sort(sortScore);
        reverseArrayInPlace(sortScore);

        String[] result = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < sortScore.length; j++) {
                if (score[i] == sortScore[j]) {
                    switch (j) {
                        case 0:
                            result[i] = "Gold Medal";
                            break;
                        case 1:
                            result[i] = "Silver Medal";
                            break;
                        case 2:
                            result[i] = "Bronze Medal";
                            break;
                        default:
                            result[i] = String.valueOf(j + 1);
                    }
                }
            }
        }

        return result;
    }

    public void reverseArrayInPlace(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
    }
}
