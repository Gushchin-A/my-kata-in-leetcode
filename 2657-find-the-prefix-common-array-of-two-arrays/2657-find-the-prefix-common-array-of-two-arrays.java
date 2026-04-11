class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C = new int[A.length];

        for (int i = 0; i < C.length; i++) {

            boolean[] seen = new boolean[51];
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (seen[A[j]]) {
                    count++;
                } else {
                    seen[A[j]] = true;
                }

                if (seen[B[j]]) {
                    count++;
                } else {
                    seen[B[j]] = true;
                }
            }
            C[i] = count;
        }

        return C;
    }
}
