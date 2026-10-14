class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int indexRes = 0;

        for (int i = 0; i < n; i++) {
            if (indexRes < n) {
                if (arr[i] != 0) {
                    temp[indexRes++] = arr[i];
                } else {
                    temp[indexRes++] = arr[i];
                    if (indexRes < n) {
                        temp[indexRes++] = arr[i];
                    }
                }
            } else {
                break;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }
}
