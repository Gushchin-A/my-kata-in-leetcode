class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int element : arr1) {
            freq.merge(element, 1, Integer::sum);
        }
 
        int[] result = Arrays.copyOf(arr1, arr1.length);
        int indexRes = 0;
        for (int element : arr2) {
            for (int i = 0; i < freq.get(element); i++) {
                result[indexRes++] = element;
            }
            freq.put(element, 0);
        }

        int[] notAppear = new int[arr1.length - arr2.length];
        int size = 0;
        for (int element : arr1) {
            if (freq.get(element) != 0) {
                notAppear[size++] = element;
            }
        }

        int[] sort = Arrays.copyOf(notAppear, size);
        Arrays.sort(sort);

        for (int element : sort) {
            result[indexRes++] = element;
        }

        return result;
    }
}