class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] temp = new int[n];
        int sum = 0;

        if (k > 0) {

            for (int i = 1; i <= k; i++) {
                sum += code[i % n];
            }

            temp[0] = sum;

            int left = 1;
            int right = k;
            int indexResult = 1;
            while (indexResult < n) {
                sum -= code[left % n];
                left++;

                right++;
                sum += code[right % n];

                temp[indexResult++] = sum;
            }

            for (int i = 0; i < n; i++) {
                code[i] = temp[i];
            }
        }

        if (k < 0) {

            k = -k;

            for (int i = -1 + n; i >= n - k; i--) {
                sum += code[i % n];
            }

            temp[0] = sum;

            int left = n - k;
            int right = n - 1;
            int indexResult = 1;
            while (indexResult < n) {
                sum -= code[left % n];
                left++;

                right++;
                sum += code[right % n];

                temp[indexResult++] = sum;
            }

            for (int i = 0; i < n; i++) {
                code[i] = temp[i];
            }
        }

        if (k == 0) {
            for (int i = 0; i < n; i++) {
                code[i] = 0;
            }
        }

        return code;
    }
}