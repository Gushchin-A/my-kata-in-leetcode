class Solution {
    public int[] findEvenNumbers(int[] digits) {
        if (validationDigitsForOdd(digits)) {
            return new int[0];
        }

        Map<Integer, Integer> countDigitsInArray = new HashMap<>();
        int minNumber = 100;
        int maxNumber = 999;

        for (int digit : digits) {
            countDigitsInArray.merge(digit, 1, Integer::sum);
        }

        int[] result = new int[maxNumber];
        int indexResult = 0;
        for (int i = minNumber; i < maxNumber; i++) {
            
            if (i % 2 == 0) {
                Map<Integer, Integer> countDigitsInNumber = getCountsDigitsFromNumber(i);
                boolean isFindNumber = true;

                for (Integer key : countDigitsInNumber.keySet()) {
                    int valueArray = countDigitsInArray.get(key) == null ? 0 : countDigitsInArray.get(key);
                    int valueNumber = countDigitsInNumber.get(key);

                    if (valueArray < valueNumber) {
                        isFindNumber = false;
                    }
                }
                if (isFindNumber) {
                    result[indexResult++] = i;
                }
            }
        }

        return Arrays.copyOf(result, indexResult);
    }

    private Map<Integer, Integer> getCountsDigitsFromNumber(int number) {
        Map<Integer, Integer> countDigits = new HashMap<>();

        while (number > 0) {
            int digit = number % 10; 
            countDigits.merge(digit, 1, Integer::sum);
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
