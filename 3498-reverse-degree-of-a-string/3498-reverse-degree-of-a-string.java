class Solution {
    public int reverseDegree(String s) {
        int alphabetSize = 26;
        int n = s.length();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int realAlphabet = s.charAt(i) - 'a';
            int reversedAlphabet = Math.abs(realAlphabet - alphabetSize); 
            int indexShift = 1;

            sum += reversedAlphabet * (i + indexShift);
        }

        return sum;
    }
}