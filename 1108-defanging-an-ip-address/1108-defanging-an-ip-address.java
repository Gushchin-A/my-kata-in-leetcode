class Solution {
    public String defangIPaddr(String address) {
        int dots = 0;

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                dots++;
            }
        }

        int newLength = address.length() - dots + (dots * 3);

        char[] result = new char[newLength];
        int newIndex = 0;
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                result[newIndex++] = '[';
                result[newIndex++] = '.';
                result[newIndex++] = ']';
            } else {
                result[newIndex++] = address.charAt(i);
            }
        }

        return new String(result);
    }
}