class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int[] numbers1 = getArrayWithDigitsAndLeadingZeros(num1); 
        int[] numbers2 = getArrayWithDigitsAndLeadingZeros(num2); 
        int[] numbers3 = getArrayWithDigitsAndLeadingZeros(num3); 

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < numbers1.length; i++) {
            str.append(Math.min(
                Math.min(numbers1[i], numbers2[i]), 
                numbers3[i]));
        }

        return Integer.parseInt(str.toString());
    }

    private int[] getArrayWithDigitsAndLeadingZeros(int num) {
        int sizeForArray = 4;
        int[] result = new int[sizeForArray];
        
        int indexResult = result.length - 1;
        while (num > 0) {
            result[indexResult--] = num % 10;
            num /= 10;
        }

        return result;
    }
}