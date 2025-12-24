class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (String w : words) {
            for (String other : words) {
                if (!w.equals(other) 
                        && w.length() <= other.length() 
                        && other.contains(w)) {
                    result.add(w);
                    break;
                }
            }
        }

        return result;
    }
}