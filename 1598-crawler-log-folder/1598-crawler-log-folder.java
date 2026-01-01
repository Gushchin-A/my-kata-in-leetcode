class Solution {
    public int minOperations(String[] logs) {
        int count = 0;

        for (String l : logs) {
            switch (l) {
                case "../" -> count -= 1;
                case "./" -> count -= 0;
                default -> count += 1;
            }

            if (count < 0) {
                count = 0;
            }
        }

        return count;
    }
}