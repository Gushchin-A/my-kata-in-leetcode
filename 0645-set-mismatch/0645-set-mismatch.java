class Solution {
    public int[] findErrorNums(int[] nums) {
        int mismatch = 2;
        int n = nums.length;
        int sumActual = n * (n + 1) / 2;

        HashSet<Integer> uniqNums = new HashSet<>();

        int sumNums = 0;
        for (int num : nums) {
            uniqNums.add(num);
            sumNums += num;
        }

        int sumUniq = 0;
        for (Integer u : uniqNums) {
            sumUniq += u;
        }

        int missNumber = sumActual - sumUniq;
        int duplicate = sumNums - sumUniq;

        int[] result = new int[mismatch];
        result[0] = duplicate;
        result[1] = missNumber;

        return result;
    }
}
