class Solution {
    public int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        var numberOne = 0;
        var numberTwo = 0;
        
        for (var i = 0; i < nums.length; i++) {
            for (var j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    numberOne = i;
                    numberTwo = j;
                    break;
                }
            }
        }

        int[] resultIndexes = new int[2];
        resultIndexes[0] = numberOne;
        resultIndexes[1] = numberTwo;

        return resultIndexes;

    }
}