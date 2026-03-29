class Solution {
    public String largestGoodInteger(String num) {
        String zeroes = "000";
        String empty = "";
        int max = 0;
        int needLength = 3;
        
        int i = 0;
        int j = 1;
        int countDuplicate = 1;
        boolean isGoodNumberWas = false;
        while (i < num.length() - 1 && j < num.length()) {
            if (num.charAt(i) == num.charAt(j)) {
                countDuplicate++;
                j++;
            } else {
                countDuplicate = 1;
                i = j;
                j++;
            }
            if (countDuplicate == needLength) {
                isGoodNumberWas = true;
                int candidate = stringToDigit(num, i, j);
                max = Math.max(max, candidate);
                countDuplicate = 1;
                i = j;
                j = i + 1;
            }
        }

        if (!isGoodNumberWas) {
            return empty;
        }

        return max == 0 ? zeroes : digitToSrtring(max);
    }

    private int stringToDigit(String num, int start, int end) {
        int result = 0;

        for (int i = start; i < end; i++) {
            int digit = num.charAt(i) - '0';
            result = result * 10 + digit;
        }

        return result;
    }

    private String digitToSrtring(int number) {
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int digit = number % 10;
            result.append((char) (digit + '0'));
            number = number / 10;
        }
    
        return result.reverse().toString();
    }
}
