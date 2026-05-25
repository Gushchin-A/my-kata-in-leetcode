class Solution {
    public int[] scoreValidator(String[] events) {
        int[] result = new int[2];

        for (String event : events) {
            if (event.equals("WD")) {
                result[0]++;
            } else if (event.equals("NB")) {
                result[0]++;
            } else if (event.equals("W")) {
                result[1]++;
                if (result[1] == 10) {
                    break;
                }
            } else {
                result[0] += Integer.parseInt(event);
            }
        }

        return result;
    }
}