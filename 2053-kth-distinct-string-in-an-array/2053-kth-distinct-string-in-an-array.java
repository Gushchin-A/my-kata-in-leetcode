class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> distinctStrings = new HashSet<>();
        Set<String> tempResult = new LinkedHashSet<>();

        for (String str : arr) {
            if (!distinctStrings.add(str)) {
                tempResult.remove(str);
            } else {
                tempResult.add(str);
            }
        }

        if (tempResult.size() < k) {
            return "";
        }

        int i = 0;
        for (String str : tempResult) {
            if (++i == k) {
                return str;
            }
        }

        return "";
    }
}