class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int minimumNumberOfmoves = 0;
        for (int i = 0; i < seats.length; i++) {
            minimumNumberOfmoves += Math.abs(seats[i] - students[i]);
        }

        return minimumNumberOfmoves;
    }
}