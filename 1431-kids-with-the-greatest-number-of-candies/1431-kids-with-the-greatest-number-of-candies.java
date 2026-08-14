class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int value : candies) {
            max = Math.max(max, value);
        }

        List<Boolean> result = new ArrayList<>();
        for (int value : candies) {
            if (value + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        return result;
    }
}
