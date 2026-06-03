class Solution {
    public int minMaxDifference(int num) {
        int size = getSizeNumber(num);
        int[] numbersMin = new int[size];
        int[] numbersMax = new int[size];

        int indexResult = size - 1;
        while (num > 0) {
            int digit = num % 10;
            numbersMin[indexResult] = digit;
            numbersMax[indexResult] = digit;
            indexResult--;
            num /= 10;
        }

        int min = getFirstlessThanNine(numbersMin);
        int maximumValue = 0;
        for (int i = 0; i < size; i++) {
            if (numbersMin[i] == min) {
                numbersMin[i] = 9;
            }
            maximumValue = maximumValue * 10 + numbersMin[i];
        }

        int max = getFirstGreaterThanZero(numbersMax);
        int minimumValue = 0;
        int multiplier = 1;
        for (int i = size - 1; i >= 0; i--) {
            if (numbersMax[i] == max) {
                numbersMax[i] = 0;
            }
            minimumValue += numbersMax[i] * multiplier;
            multiplier *= 10;
        }

        return maximumValue - minimumValue;
    }

    private int getSizeNumber(int num) {
        int size = 0;

        while (num > 0) {
            size++;
            num /= 10;
        }

        return size;
    }

    private int getFirstlessThanNine(int[] numbers) {
        int result = numbers[0];

        for (int num : numbers) {
            if (num < 9) {
                return num;
            }
        }

        return result;
    }

    private int getFirstGreaterThanZero(int[] numbers) {
        int result = numbers[0];

        for (int num : numbers) {
            if (num > 0) {
                return num;
            }
        }

        return result;
    }
}
