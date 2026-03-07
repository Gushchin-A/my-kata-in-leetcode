class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int indexKey = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> throw new IllegalArgumentException("Unknown ruleKey");
        };

        int itemsMatchRule = 0;
        for (List<String> list : items) {
            if (list.get(indexKey).equals(ruleValue)) {
                itemsMatchRule++;
            }
        }

        return itemsMatchRule;
    }
}