class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int hoursFormat = 24;
        
        return (arrivalTime + delayedTime) % hoursFormat;
    }
}