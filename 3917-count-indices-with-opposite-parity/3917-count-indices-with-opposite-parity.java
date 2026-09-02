class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            boolean isEven = nums[i] % 2 == 0 ? true : false; 
            for (int j = i + 1; j < nums.length; j++) {
                boolean isOdd = nums[j] % 2 != 0 ? true : false;
                if (isEven == isOdd) {
                    count++;
                }
            }
            answer[i] = count;
        }

        return answer;
    }
}
