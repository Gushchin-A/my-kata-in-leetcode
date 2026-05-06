class Solution {
    private static final int[] FIRST_WEEK = {1, 2, 3, 4, 5, 6, 7};
    private static final int SUM_FIRST_WEEK = 28;
    private static final int AMOUNT_EXTRA_WEEK = 7;
    private static final int DAYS_IN_WEEK = 7;

    public int totalMoney(int n) {
        int totalAmount = 0;
        int fullWeeks = n / DAYS_IN_WEEK;

        if (fullWeeks > 0) {
            for (int i = 0; i < fullWeeks; i++) {
                totalAmount += SUM_FIRST_WEEK + i * AMOUNT_EXTRA_WEEK;
            }
        }

        int days = n % DAYS_IN_WEEK;
        for (int i = 0; i < days; i++) {
            totalAmount += FIRST_WEEK[i] + fullWeeks;
        }

        return totalAmount;      
    }
}