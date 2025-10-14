class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> scores = new ArrayList<>();
        
        int result = 0;
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "+":
                    result += scores.get(scores.size() - 1) + scores.get(scores.size() - 2);
                    scores.add(scores.get(scores.size() - 1) + scores.get(scores.size() - 2));
                    break;
                case "C":
                    result -= scores.get(scores.size() - 1);
                    scores.remove(scores.size() - 1);
                    break;
                case "D":
                    result += scores.get(scores.size() - 1) * 2;
                    scores.add(scores.get(scores.size() - 1) * 2);
                    break;
                default:
                    result += Integer.valueOf(operations[i]);
                    scores.add(Integer.valueOf(operations[i]));
            }
        }

        return result;
    }
}
