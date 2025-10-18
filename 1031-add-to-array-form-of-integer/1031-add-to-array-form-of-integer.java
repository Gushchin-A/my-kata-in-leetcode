class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> result = new LinkedList<>();
        
        int carry = 0;
        for (int i = num.length - 1; i >= 0 || carry > 0 || k != 0; i--) {
            int digitK = k % 10;
            k = k / 10;

            int digitNum = i < 0 ? 0 : num[i];
            int digit = digitNum + digitK + carry;
            result.addFirst(digit % 10);
            carry = digit / 10;
        }

        return result;
    }
}