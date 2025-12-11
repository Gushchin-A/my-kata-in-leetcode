class Solution {
    public boolean lemonadeChange(int[] bills) {
        if (bills[0] != 5) {
            return false;
        }

        int five = 0;
        int ten = 0;
        int twenty = 0;
        for (int b : bills) {
            if (b == 5) {
                five += 1; 
            } else if (b == 10) {
                if (five != 0) {
                    five -= 1;
                    ten += 1;
                } else {
                    return false;
                }
            } else if (b == 20) {
                if (ten > 0) {
                    if (five > 0) {
                    five -= 1;
                    ten -= 1;
                    twenty += 1;
                    } else {
                        return false;
                    }
                } else {
                    if (five >= 3) {
                        five -= 3;
                        twenty += 1;
                    } else {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}