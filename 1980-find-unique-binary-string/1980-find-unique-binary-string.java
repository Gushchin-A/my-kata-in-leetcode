class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> uniqBinaryNums = new HashSet<>();
        Collections.addAll(uniqBinaryNums, nums);

        String result = "";
        for (String binaryString : nums) {

            StringBuilder str = new StringBuilder();
            for (char c : binaryString.toCharArray()) {
                str.append(c);
            }

            StringBuilder candidate = str;
            for (int i = 0; i < str.length(); i++) {
                if (candidate.charAt(i) == '1') {
                    candidate.setCharAt(i, '0');
                } else {
                    candidate.setCharAt(i, '1');
                }

                if (!uniqBinaryNums.contains(candidate.toString())) {
                    result = candidate.toString();
                    break;
                } else {
                    candidate = str;
                }
            }
        }

        return result;
    }
}