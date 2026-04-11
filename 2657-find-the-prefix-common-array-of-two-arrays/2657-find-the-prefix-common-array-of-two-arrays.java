class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C = new int[A.length];

        for (int i = 0; i < C.length; i++) {
            Set<Integer> uniq = new HashSet<>();
            for (int j = 0; j <= i; j++) {
                uniq.add(A[j]);
            }
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (!uniq.add(B[j])) {
                    count++;
                }
            }
            C[i] = count;
        }

        return C;
    }
}
