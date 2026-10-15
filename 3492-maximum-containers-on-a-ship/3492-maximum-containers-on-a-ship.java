class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int cargoDecks = n * n;
        int totalContainers = maxWeight / w;

        return Math.min(totalContainers, cargoDecks);
    }
}