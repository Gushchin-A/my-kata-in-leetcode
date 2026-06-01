class Solution {
    public int[] findEvenNumbers(int[] digits) {
        if (validationDigitsForOdd(digits)) {
            return new int[0];
        }

        int[] countDigitsInArray = new int[10];
        int minNumber = 100;
        int maxNumber = 999;

        for (int digit : digits) {
            countDigitsInArray[digit]++;
        }

        int[] result = new int[maxNumber];
        int indexResult = 0;
        for (int i = minNumber; i < maxNumber; i++) {
            
            if (i % 2 == 0) {
                int[] countDigitsInNumber = getCountsDigitsFromNumber(i);
                boolean isFindNumber = true;

                for (int j = 0; j < 10; j++) {
                    int valueArray = countDigitsInArray[j];
                    int valueNumber = countDigitsInNumber[j];

                    if (valueArray < valueNumber) {
                        isFindNumber = false;
                        break;
                    }
                }
                if (isFindNumber) {
                    result[indexResult++] = i;
                }
            }
        }

        return Arrays.copyOf(result, indexResult);
    }

    private int[] getCountsDigitsFromNumber(int number) {
        int[] countDigits = new int[10];

        while (number > 0) {
            int digit = number % 10; 
            countDigits[digit]++;
            number /= 10;
        }

        return countDigits;
    }

    private boolean validationDigitsForOdd(int[] digits) {
        for (int digit : digits) {
            if (digit % 2 == 0) {
                return false;
            }
        }

        return true;
    }
}
