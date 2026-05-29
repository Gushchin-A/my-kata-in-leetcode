class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] temp = new int[n];

        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;

                int j = i + 1;
                int index = 0;
                while (index < k) {
                    sum += code[j % n];
                    index++;
                    j++;
                }
                temp[i] = sum;
            }

            for (int i = 0; i < n; i++) {
                code[i] = temp[i];
            }
        }

        if (k < 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;

                int j = i - 1 + n;
                int index = 0;
                while (index > k) {
                    sum += code[j % n];
                    index--;
                    j--;
                }
                temp[i] = sum;
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