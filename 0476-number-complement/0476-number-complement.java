class Solution {
    public int findComplement(int num) {
        String temp = Integer.toBinaryString(num);
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '1') {
                result.append('0');
            } else {
                result.append('1');
            }
        }

        return Integer.parseInt(result.toString(), 2);
    }
}
