class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                break;
            }
            n /= 2;
        }

        while (n > 1) {
            if (n % 3 != 0) {
                break;
            }
            n /= 3;
        }

        while (n > 1) {
            if (n % 5 != 0) {
                break;
            }
            n /= 5;
        }

        return n == 1;
    }
}