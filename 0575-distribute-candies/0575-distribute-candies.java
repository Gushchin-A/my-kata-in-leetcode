class Solution {
    public int distributeCandies(int[] candyType) {
        int maximumCanEat = candyType.length / 2;
        HashSet<Integer> uniqCandy = new HashSet<>();

        for (int candy : candyType) {
            uniqCandy.add(candy);
        }

        if (uniqCandy.size() <= maximumCanEat) {
            return uniqCandy.size();
        }

        return maximumCanEat;
    }
}