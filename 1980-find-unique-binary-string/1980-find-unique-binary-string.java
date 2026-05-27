class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder uniqString = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            char c = nums[i].charAt(i);
            uniqString.append(c == '1' ? '0' : '1');
        }

        return uniqString.toString();
    }
}