class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);

        int left = 0;
        int right = price[price.length - 1] - price[0];
        int best = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canTakeCandies(price, k, mid)) {
                best = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return best;
    }

    public boolean canTakeCandies(int[] price, int k, int dist) {
        int n = price.length;

        int current = 0;
        int next = 1;
        k--;
        while (next < n) {
            if (price[next] - price[current] >= dist) {
                k--;
                current = next;
            }
            if (k == 0) {
                return true;
            }
            next++;
        }

        return false;
    }
}
