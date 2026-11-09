class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for (int i = 0; i < students.length; i++) {
            int type = students[i];
            count[type]++;
        }

        for (int i = 0; i < sandwiches.length; i++) {
            int type = sandwiches[i];
            if (count[type] > 0) {
                count[type]--;
            } else {
                break;
            }
        }

        return count[0] + count[1];
    }
}
