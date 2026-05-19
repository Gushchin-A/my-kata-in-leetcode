class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<String> food = new ArrayList<>();

        for (List<String> order : orders) {
            food.add(order.getLast());
        }

        List<String> uniqFoods = food.stream().distinct().sorted().collect(Collectors.toList());

        Map<Integer, Map<String, Integer>> tablesAndFood = new TreeMap<>();
        for (List<String> order : orders) {
            int tableNumber = Integer.parseInt(order.get(1));
            String foodItem = order.get(2);

            tablesAndFood.putIfAbsent(tableNumber, new HashMap<>());

            Map<String, Integer> foodCount = tablesAndFood.get(tableNumber);

            foodCount.put(foodItem, foodCount.getOrDefault(foodItem, 0) + 1);
        }

        List<String> nameColumns = new ArrayList<>();
        nameColumns.add("Table");
        for (String uniqFood : uniqFoods) {
            nameColumns.add(uniqFood);
        }

        List<List<String>> result = new ArrayList<>();
        result.add(nameColumns);

        for (Map.Entry<Integer, Map<String, Integer>> entry : tablesAndFood.entrySet()) {
            List<String> row = new ArrayList<>();

            row.add(String.valueOf(entry.getKey()));

            Map<String, Integer> foodCount = entry.getValue();

            for (String foodName : uniqFoods) {
                row.add(String.valueOf(foodCount.getOrDefault(foodName, 0)));
            }

            result.add(row);
        }

        return result;
    }
}