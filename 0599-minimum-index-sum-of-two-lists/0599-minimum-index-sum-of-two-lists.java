class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> stringsAndIndices = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            stringsAndIndices.put(list1[i], i);
        }

        Map<String, Integer> indices = new HashMap<>();
        for (int i = 0; i < list2.length; i++) {
            if (stringsAndIndices.containsKey(list2[i])) {
                indices.put(list2[i], stringsAndIndices.get(list2[i]) + i);
            }
        }

        Integer min = indices.values().stream()
            .min(Integer::compare)
            .orElse(null);

        
        int countMin = 0;
        for (Integer value : indices.values()) {
            if (value.equals(min)) {
                countMin++;
            }
        }

        String[] result = new String[countMin];
        int indexRes = 0;
        for (Map.Entry<String, Integer> entry : indices.entrySet()) {
            if (entry.getValue().equals(min)) {
                result[indexRes++] = entry.getKey();
            }
        }

        return result;
    }
}