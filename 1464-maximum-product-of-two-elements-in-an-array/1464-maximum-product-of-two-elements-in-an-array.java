class Solution {
    public int maxProduct(int[] nums) {
        int firstMax = -1;
        
        for (int num : nums) {
            firstMax = Math.max(firstMax, num);
        }

        int seenFirstMax = 0;
        int secondMax = 0;
        for (int num : nums) {
            if (num == firstMax) {
                seenFirstMax++;
                if (seenFirstMax > 1) {
                    return (firstMax - 1) * (firstMax - 1);
                }
            }
            if (num < firstMax) {
                secondMax = Math.max(secondMax, num);
            }
        }

        return (firstMax - 1) * (secondMax - 1);
    }
}