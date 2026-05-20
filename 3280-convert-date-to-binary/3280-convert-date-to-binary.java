class Solution {
    public String convertDateToBinary(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

        StringBuilder result = new StringBuilder();
        result.append(Integer.toBinaryString(year)).append("-");
        result.append(Integer.toBinaryString(month)).append("-");
        result.append(Integer.toBinaryString(day));

        return result.toString();
    }
}