class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        int moved = 0;
        for (int start = 0; moved < n; start++) {

            int currentIndex = start;
            int save = nums[currentIndex];

            while (true) {
                int nextIndex = (currentIndex + k) % n;
                int temp = nums[nextIndex];
                nums[nextIndex] = save;
                save = temp;
                currentIndex = nextIndex;
                moved++;

                if (currentIndex == start) {
                    break;
                }
            }
        }
    }
}