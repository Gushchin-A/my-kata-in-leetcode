class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> distinctStrings = new HashSet<>();
        List<String> tempResult = new ArrayList<>();

        for (String str : arr) {
            if (!distinctStrings.add(str)) {
                tempResult.remove(str);
            } else {
                tempResult.add(str);
            }
        }

        return tempResult.size() < k ? "" : tempResult.get(k - 1);
    }
}