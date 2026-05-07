class Solution {
    public int minimumSum(int num) {
        int size = (int) Math.log10(num) + 1;
        int[] sortNumbers = new int[size];

        int index = 0;
        while (num > 0) {
            int digit = num % 10;
            sortNumbers[index++] = digit;
            num /= 10;
        }

        Arrays.sort(sortNumbers);

        int new1 = sortNumbers[0] * 10 + sortNumbers[2];
        int new2 = sortNumbers[1] * 10 + sortNumbers[3];

        return new1 + new2; 
    }
}