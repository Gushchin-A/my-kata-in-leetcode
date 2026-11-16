class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = { "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday" };
        int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int totalDays = day - 1;

        for (int i = 0; i < month - 1; i++) {
            totalDays += monthDays[i];
        }

        for (int i = 1971; i < year; i++) {
            if (i % 4 == 0) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }

        if (month > 2 && year % 4 == 0 && year != 2_100) {
            totalDays += 1;
        }

        return days[totalDays % 7];
    }
}
