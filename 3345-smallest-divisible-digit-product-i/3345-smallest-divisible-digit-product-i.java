class Solution {
    public int smallestNumber(int n, int t) {
        int result = 0;

        while (true) {
            int productDigits = getProductDigits(n);
            if (productDigits % t == 0) {
                result = n;
                break;
            } else {
                n++;
            }
        }

        return result;
    }

    private int getProductDigits(int n) {
        int productDigits = 1;

        while (n > 0) {
            productDigits *= n % 10;
            n /= 10;
        }

        return productDigits;
    }
}
