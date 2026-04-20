class Solution {
    public int[] separateDigits(int[] nums) {
        int sizeAnswer = 0;

        for (int num : nums) {
            sizeAnswer += getCountDigitsFromNum(num);
        }

        int[] answer = new int[sizeAnswer];
        int indexAnswer = 0;
        for (int num : nums) {
            int sizeDigits = getCountDigitsFromNum(num);
            indexAnswer += sizeDigits; 

            int tempIndexAnswer = indexAnswer - 1;
            while (num > 0) {
                int digit = num % 10;
                num /= 10;
                answer[tempIndexAnswer--] = digit;
            }
        }

        return answer;
    }

    private int getCountDigitsFromNum(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}