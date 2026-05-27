class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> uniqBinaryNums = new HashSet<>();
        Collections.addAll(uniqBinaryNums, nums);

        String result = "";
        for (String binaryString : nums) {

            StringBuilder candidate = new StringBuilder();
            for (char c : binaryString.toCharArray()) {
                candidate.append(c);
            }

            for (int i = 0; i < candidate.length(); i++) {
                if (candidate.charAt(i) == '1') {
                    candidate.setCharAt(i, '0');
                } else {
                    candidate.setCharAt(i, '1');
                }

                if (!uniqBinaryNums.contains(candidate.toString())) {
                    result = candidate.toString();
                    break;
                } else {
                    if (candidate.charAt(i) == '1') {
                        candidate.setCharAt(i, '0');
                    } else {
                        candidate.setCharAt(i, '1');
                    }
                }
            }
        }

        return result;
    }
}