class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int left = 0;
        int right = 0;

        while (left < name.length() && right < typed.length()) {
            if (name.charAt(left) != typed.charAt(right)) {
                return false;
            }

            int need = 1;
            int type = 1;

            while (left < name.length() - 1 && name.charAt(left) == name.charAt(left + 1)) {
                need++;
                left++;
            }

            while (right < typed.length() - 1 && typed.charAt(right) == typed.charAt(right + 1)) {
                type++;
                right++;
            }

            if (type < need) {
                return false;
            } else {
                left++;
                right++;
            }
        }

        return left == name.length() && right == typed.length();
    }
}
