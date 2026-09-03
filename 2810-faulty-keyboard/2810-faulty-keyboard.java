class Solution {
    public String finalString(String s) {
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'i') {
                size++;
            }
        }

        char[] letters = new char[size];

        int indexRes = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                reverseCharArray(letters, indexRes - 1);
            } else {
                letters[indexRes++] = s.charAt(i);
            }
        }

        return new String(letters);
    }

    private void reverseCharArray(char[] array, int end) {
        int left = 0;
        int right = end;

        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}
