class Solution {
    public int largestInteger(int num) {
        if (num < 10) {
            return num;
        }

        int[] original = numberToArray(num);
        int[] sort = numberToArray(num);

        Arrays.sort(sort);
        reverseArray(sort);

        int n = original.length;

        for (int i = 0; i < n; i++) {
            int digit = original[i];
            if (digit % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    int digitSort = sort[j];
                    if (digitSort % 2 == 0 && digitSort >= 0) {
                        original[i] = digitSort;
                        sort[j] = -1;
                        break;
                    }
                }
            } else {
                for (int j = 0; j < n; j++) {
                    int digitSort = sort[j];
                    if (digitSort % 2 != 0 && digitSort >= 0) {
                        original[i] = digitSort;
                        sort[j] = -1;
                        break;
                    }
                }
            }
        }

        return arrayToNum(original);
    }

    public static int[] numberToArray(int num) {
        int n = String.valueOf(num).length();
        int[] result = new int[n];

        int index = n - 1;
        while (num != 0) {
            result[index--] = num % 10;
            num = num / 10;
        }

        return result;
    }

    public static void reverseArray(int[] array) {
        int n = array.length;

        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static int arrayToNum(int[] array) {
        int n = array.length;

        int result = 0;
        int placeValue = 10;
        for (int i = 0; i < n; i++) {
            int digit = array[i];
            result = (result * placeValue) + digit;
        }

        return result;
    }
}