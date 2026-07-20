class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) {
                count++;
            }
        }

        return count;
    }

    private boolean isSymmetric(int num) {
        int countDigits = getCountDigits(num);

        if (countDigits % 2 != 0) {
            return false;
        }
        
        int middle = countDigits / 2;

        int left = 0;
        int right = 0;
        while (num > 0) {
            int digit = num % 10;

            if (countDigits > middle) {
                right += digit;
            } else {
                left += digit;
            }

            num /= 10;
            countDigits--;
        }

        return (left - right) == 0;
    }

    private int getCountDigits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}
