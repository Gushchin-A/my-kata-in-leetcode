class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C = new int[A.length];

        for (int i = 0; i < C.length; i++) {

            boolean[] seen = new boolean[51];
            for (int j = 0; j <= i; j++) {
                seen[A[j]] = true;
            }

            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (seen[B[j]]) {
                    count++;
                }
            }

            C[i] = count;
        }

        return C;
    }
}
