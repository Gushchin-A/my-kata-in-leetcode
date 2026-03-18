class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int finalValue = 0;

        for (String operation : operations) {
            int value = switch (operation) {
                case "++X", "X++" -> 1;
                case "--X", "X--" -> -1;
                default -> throw new IllegalArgumentException();
            };
            finalValue += value;
        }

        return finalValue;
    }
}
