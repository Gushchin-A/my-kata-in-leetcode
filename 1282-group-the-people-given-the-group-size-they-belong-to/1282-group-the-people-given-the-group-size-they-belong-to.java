class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> groupsAndPersons = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> persons = groupsAndPersons.getOrDefault(groupSizes[i], new ArrayList<>());
            persons.add(i);
            groupsAndPersons.put(groupSizes[i], persons);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> keyValue : groupsAndPersons.entrySet()) {
            
            List<Integer> tempGroup = keyValue.getValue();
            int maxSize = keyValue.getKey();
            List<Integer> group = new ArrayList<>();
            for (int i = 0; i < tempGroup.size(); i++) {
                group.add(tempGroup.get(i));
                if (group.size() == maxSize) {
                    result.add(group);
                    group = new ArrayList<>();
                }
            }
        }

        return result;
    }
}