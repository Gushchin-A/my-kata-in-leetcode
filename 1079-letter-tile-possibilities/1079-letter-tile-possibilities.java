class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> result = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];

        build(tiles, "", used, result);

        return result.size();
    }

    private void build(String tiles, String current, boolean[] used, Set<String> result) {
        for (int i = 0; i < tiles.length(); i++) {
            if (used[i]) {
                continue;
            }
            char ch = tiles.charAt(i);
            String next = current + ch;
            
            result.add(next);
            used[i] = true;
            build(tiles, next, used, result);

            used[i] = false;
        }
    }
}