class Solution {
    public int findLucky(int[] arr) {
        int maxValueConstraints = 500;
        int[] counts = new int[maxValueConstraints + 1];

        for (int num : arr) {
            counts[num]++;
        }

        int result = -1;
        for (int num : arr) {
            if (num == counts[num]) {
                if (num > result) {
                    result = num;
                }
            }
        }

        return result;
    }
}