class Solution {
    public String reverseByType(String s) {
        char[] tempRes = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !(tempRes[left] >= 'a' && tempRes[left] <= 'z')) {
                left++;
            }
            while (left < right && !(tempRes[right] >= 'a' && tempRes[right] <= 'z')) {
                right--;
            }
            if ((tempRes[left] >= 'a' && tempRes[left] <= 'z')
                    && (tempRes[right] >= 'a' && tempRes[right] <= 'z')) {
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
            while (left < right && (tempRes[left] >= 'a' && tempRes[left] <= 'z')) {
                left++;
            }
            while (left < right && (tempRes[right] >= 'a' && tempRes[right] <= 'z')) {
                right--;
            }
            if (!(tempRes[left] >= 'a' && tempRes[left] <= 'z')
                    && !(tempRes[right] >= 'a' && tempRes[right] <= 'z')) {
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