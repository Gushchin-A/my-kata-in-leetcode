class Solution {
    private static final int[] firstWeek = {1, 2, 3, 4, 5, 6, 7};
    private static final int sumFirstWeek = 28;
    private static final int amountExtraWeek = 7;

    public int totalMoney(int n) {
        int totalAmount = 0;
        int fullWeeks = n / 7;

        if (fullWeeks > 0) {
            for (int i = 0; i < fullWeeks; i++) {
                totalAmount += sumFirstWeek + i * amountExtraWeek;
            }
        }

        int days = n % 7;
        for (int i = 0; i < days; i++) {
            totalAmount += firstWeek[i] + fullWeeks;
        }

        return totalAmount;      
    }
}