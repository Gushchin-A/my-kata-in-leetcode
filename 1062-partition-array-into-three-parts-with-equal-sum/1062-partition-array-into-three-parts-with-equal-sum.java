class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        int threeParts = 3;


        for (int a : arr) {
            totalSum += a;
        }

        if (totalSum % threeParts != 0) {
            return false;
        }

        int targetSum = totalSum / threeParts;
        int partition = 0;
        int subSum = 0;
        for (int i = 0; i < n - 1; i++) {
            subSum += arr[i];
            if (subSum == targetSum) {
                partition++;
                subSum = 0;
                if (partition == 2) {
                    return true;
                }
            }
        }
        
        return false;
    }
}