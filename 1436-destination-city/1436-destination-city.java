class Solution {
    public String destCity(List<List<String>> paths) {
        String candidate = paths.getFirst().getLast();

        for (List<String> p : paths) {
            for (List<String> p2 : paths) {
                String departure = p2.getFirst();
                if (candidate.equals(departure)) {
                    candidate = p.getLast();
                    break;
                }
            }
        }

        return candidate;
    }
}