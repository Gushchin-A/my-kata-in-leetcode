class Solution {
    public int[] getConcatenation(int[] nums) {
        int repeat = 2;
        int[] ans = new int[nums.length * repeat];
        
        int indexAns = 0;
        for (int i = 0; i < repeat; i++) {
            for (int n : nums) {
                ans[indexAns++] = n;
            }
        }

        return ans;
    }
}