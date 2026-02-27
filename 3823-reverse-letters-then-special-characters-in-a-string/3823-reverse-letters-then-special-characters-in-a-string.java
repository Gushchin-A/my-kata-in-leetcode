class Solution {
    public String reverseByType(String s) {
        char[] tempRes = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetter(tempRes[left])) {
                left++;
            }
            if (!Character.isLetter(tempRes[right])) {
                right--;
            }
            if (Character.isLetter(tempRes[left]) && Character.isLetter(tempRes[right])) {
                char temp = tempRes[left];
                tempRes[left] = tempRes[right];
                tempRes[right] = temp;

                left++;
                right--;
            }
        }

        left = 0;
        right = s.length() - 1;
        while (left < right) {
            if (Character.isLetter(tempRes[left])) {
                left++;
            }
            if (Character.isLetter(tempRes[right])) {
                right--;
            }
            if (!Character.isLetter(tempRes[left]) && !Character.isLetter(tempRes[right])) {
                char temp = tempRes[left];
                tempRes[left] = tempRes[right];
                tempRes[right] = temp;

                left++;
                right--;
            }
        }

        return new String(tempRes);
    }
}