class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> sortedNamesHeights = new TreeMap<>();

        for (int i = 0; i < heights.length; i++) {
            sortedNamesHeights.put(heights[i], names[i]);
        }

        int indexRes = names.length - 1;
        for (Integer height : sortedNamesHeights.keySet()) {
            names[indexRes--] = sortedNamesHeights.get(height);
        }

        return names;
    }
}