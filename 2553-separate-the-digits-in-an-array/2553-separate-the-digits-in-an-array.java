class Solution {
    public int[] separateDigits(int[] nums) {
        int sizeAnswer = 0;

        for (int num : nums) {
            sizeAnswer += getCountDigitsFromNum(num);
        }

        int[] answer = new int[sizeAnswer];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }

        for (int num : nums) {
            int[] reverse = new int[getCountDigitsFromNum(num)];
            int index = 0;
            while (num > 0) {
                int digit = num % 10;
                num /= 10;
                reverse[index++] = digit;
            }
            putDigitsToArray(reverse, answer);
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

    private void putDigitsToArray(int[] reverse, int[] answer) {
        int indexRes = 0;

        for (int num : answer) {
            if (num != -1) {
                indexRes++;
            } else {
                break;
            }
        }

        for (int i = reverse.length - 1; i >= 0; i--) {
            answer[indexRes++] = reverse[i];
        }
    }
}