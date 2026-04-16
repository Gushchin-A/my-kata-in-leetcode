class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int tempSum = 0;
            int lengthSubarray = 1;
            for (int j = i; j < arr.length; j++) {
                tempSum += arr[j];
                if (lengthSubarray % 2 != 0) {
                    sum += tempSum;
                }
                lengthSubarray++;
            }
        }

        return sum;
    }
}