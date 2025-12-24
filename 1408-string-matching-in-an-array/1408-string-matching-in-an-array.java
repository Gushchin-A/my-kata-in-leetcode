class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> result = new HashSet<>();

        for (String w : words) {
            for (String other : words) {
                if (w.equals(other) || w.length() > other.length()) {
                    continue;
                } else if (other.contains(w)) {
                    result.add(w);
                }
            }
        }

        return new ArrayList<String>(result);
    }
}