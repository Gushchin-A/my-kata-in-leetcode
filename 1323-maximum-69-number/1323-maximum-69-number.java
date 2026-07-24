class Solution {
    public int maximum69Number(int num) {
        String numberStr = Integer.toString(num);

        int changeIndex = -1;
        for (int i = 0; i < numberStr.length(); i++) {
            if (numberStr.charAt(i) - '0' == 6) {
                changeIndex = i;
                break;
            }
        }

        StringBuilder tempMax = new StringBuilder(numberStr.length());
        for (int i = 0; i < numberStr.length(); i++) {
            if (i == changeIndex) {
                tempMax.append('9');
                continue;
            }
            tempMax.append(numberStr.charAt(i));
        }

        return Integer.parseInt(tempMax.toString());
    }
}
