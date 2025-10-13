class Solution {
    public int[] findErrorNums(int[] nums) {
        int mismatch = 2;
        HashSet<Integer> uniqNums = new HashSet<>();

        int sumNums = 0;
        for (int n : nums) {
            uniqNums.add(n);
            sumNums += n;
        }

        int sumUniq = 0;
        for (Integer u : uniqNums) {
            sumUniq += u;
        }

        int n = nums.length;
        int sumActual = n * (n + 1) / 2;

        int missNumber = sumActual - sumUniq;
        int duplicate = sumNums - sumUniq;

        int[] result = new int[mismatch];
        result[0] = duplicate;
        result[1] = missNumber;

        return result;
    }
}