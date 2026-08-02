class Solution {
    int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start = Math.max(getDayOfYear(arriveAlice), getDayOfYear(arriveBob));
        int end = Math.min(getDayOfYear(leaveAlice), getDayOfYear(leaveBob));

        if (end - start < 0) {
            return 0;
        }

        return end - start + 1;
    }

    public int getDayOfYear(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int dateOfMonth = Integer.parseInt(date.substring(3));

        int daysBefore = 0;
        for (int i = 0; i < month - 1; i++) {
            daysBefore += months[i];
        }

        return daysBefore + dateOfMonth;
    }
}
