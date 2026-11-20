class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (n == 0) {
                break;
            }

            if (flowerbed[i] == 0) {
                if (i + 1 < flowerbed.length) {
                    if (flowerbed[i + 1] == 0) {
                        n--;
                        i++;
                    }
                } else {
                    n--;
                    i++;
                }
            } else {
                i++;
            }
        }

        return n == 0;
    }
}