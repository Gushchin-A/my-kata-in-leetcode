class Solution {
    public int maxLength(int[] nums) {
        int result = -1;

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            int gcd = nums[i];
            int lcm = nums[i];

            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                gcd = getGcd(gcd, nums[j]);
                lcm = getLcm(lcm, nums[j]);

                if (product == gcd * lcm) {
                    result = Math.max(result, j - i + 1);
                }
            }
        }

        return result;
    }

    private static int getGcd(int a, int b) {
        return (b == 0) ? a : getGcd(b, a % b);
    }

    private static int getLcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        return a / getGcd(a, b) * b;
    }
}
