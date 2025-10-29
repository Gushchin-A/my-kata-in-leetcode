class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> temp = new ArrayList<>();
        int n = nums.length;

        for (int j = 0; j < n; j++) {
            int element = nums[j];
            int indexTemp = index[j]; 
            temp.add(indexTemp, element);
        }

        int[] target = new int[n];
        int indexTarget = 0;
        for (Integer i : temp) {
            target[indexTarget++] = i;
        }

        return target;
    }
}