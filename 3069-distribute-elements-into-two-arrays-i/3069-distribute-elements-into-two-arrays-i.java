class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(nums[0]);
        list2.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            int last1 = list1.getLast();
            int last2 = list2.getLast(); 

            if (last1 > last2) {
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }

        int[] result = new int[list1.size() + list2.size()];
        
        int indexRes = 0;
        for (int value : list1) {
            result[indexRes++] = value; 
        }
        for (int value : list2) {
            result[indexRes++] = value; 
        }

        return result;
    }
}