class Solution {
    public int countPoints(String rings) {
        Map<Character, Set<Character>> freqRodsRings = new HashMap<>();

        for (int i = 0; i < rings.length() - 1; i += 2) {
            char color = rings.charAt(i);
            char rod = rings.charAt(i + 1);
            if (!freqRodsRings.containsKey(rod)) {
                freqRodsRings.put(rod, new HashSet<>(List.of(color)));
            } else {
                Set<Character> colors = freqRodsRings.get(rod);
                colors.add(color);
                freqRodsRings.put(rod, colors);
            }
        }

        int result = 0;
        int needColors = 3;
        for (Set<Character> colors : freqRodsRings.values()) {
            if (colors.size() == needColors) {
                result++;
            }
        }

        return result;
    }
}