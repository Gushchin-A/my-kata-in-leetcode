class Solution {
    public String defangIPaddr(String address) {
        StringBuilder temp = new StringBuilder();

        for (char c : address.toCharArray()) {
            if (c == '.') {
                temp.append("[.]");
            } else {
                temp.append(c);
            }
        }

        return new String(temp);
    }
}