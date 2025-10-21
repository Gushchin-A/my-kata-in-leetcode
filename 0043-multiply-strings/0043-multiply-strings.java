class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] tempResult = new int[num1.length() + num2.length()];

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (j >= 0) {
            int digitTwo = num2.charAt(j) - '0';
            while (i >= 0) {
                int digitOne = num1.charAt(i) - '0';
                int temp = digitTwo * digitOne + tempResult[j + i + 1];
                tempResult[j + i + 1] = temp % 10;
                tempResult[j + i] += temp / 10;
                i--;
            }
            j--;
            i = num1.length() - 1;
        }

        StringBuilder result = new StringBuilder();
        for (int k = 0; k < tempResult.length; k++) {
            if (k == 0 && tempResult[k] == 0) {
                continue;
            } else {
                result.append(tempResult[k]);
            }
        }

        return result.toString();
    }
}