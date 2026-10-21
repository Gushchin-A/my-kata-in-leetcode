class Solution {
    public int countEven(int num) {
        int count = 0;

        for (int i = num; i >= 2; i--) {
            if (i > 9) {
                int sum = getSumDigitsFromNumber(i);
                if (sum % 2 == 0) {
                    count++;
                }
            } else {
                if (i % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    private int getSumDigitsFromNumber(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}