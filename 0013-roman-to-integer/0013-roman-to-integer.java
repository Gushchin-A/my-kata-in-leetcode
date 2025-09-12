class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romamNumerals = new HashMap<>();
        romamNumerals.put('I', 1);
        romamNumerals.put('V', 5);
        romamNumerals.put('X', 10);
        romamNumerals.put('L', 50);
        romamNumerals.put('C', 100);
        romamNumerals.put('D', 500);
        romamNumerals.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentConvert = romamNumerals.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int nextConvert = romamNumerals.get(s.charAt(i + 1));
                if (currentConvert >= nextConvert) {
                    result += currentConvert;
                }
                else if (currentConvert < nextConvert) {
                    result -= currentConvert;
                }
            } else {
                result += currentConvert;
            }
        }

        return result;
    }
}
