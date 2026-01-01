class Solution {
    public int minOperations(String[] logs) {
        int count = 0;

        for (String l : logs) {
            switch (l) {
                case "../" -> {
                    if (count > 0) {
                        count--;
                    }
                }
                case "./" -> { }
                default -> count++;
            }
        }

        return count;
    }
}