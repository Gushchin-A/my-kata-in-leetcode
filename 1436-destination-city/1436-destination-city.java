class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> departures = new HashSet<>();
        for (List<String> p : paths) {
            departures.add(p.getFirst());
        }

        String candidate = "";
        for (List<String> p : paths) {
            candidate = p.getLast();
            if (!departures.contains(candidate)) {
                break;
            }
        }

        return candidate;
    }
}