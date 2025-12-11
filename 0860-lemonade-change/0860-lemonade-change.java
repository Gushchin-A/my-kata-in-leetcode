class Solution {
    public boolean lemonadeChange(int[] bills) {
        if (bills[0] != 5) {
            return false;
        }

        int[] banknotes = new int[3];
    
        for (int b : bills) {
            if (b == 5) {
                banknotes[0] += 1; 
            } else if (b == 10) {
                if (banknotes[0] != 0) {
                    banknotes[0] -= 1;
                    banknotes[1] += 1;
                } else {
                    return false;
                }
            } else if (b == 20) {
                if (banknotes[1] > 0) {
                    if (banknotes[0] > 0) {
                    banknotes[0] -= 1;
                    banknotes[1] -= 1;
                    banknotes[2] += 1;
                    } else {
                        return false;
                    }
                } else {
                    if (banknotes[0] >= 3) {
                        banknotes[0] -= 3;
                        banknotes[2] += 1;
                    } else {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}