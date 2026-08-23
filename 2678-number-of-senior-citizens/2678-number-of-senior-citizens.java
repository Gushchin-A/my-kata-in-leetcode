class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for (String info : details) {
            char firstDigtit = info.charAt(info.length() - 4);
            char secondDigtit = info.charAt(info.length() - 3);
            
            if (firstDigtit == '6' && secondDigtit == '0') {
                continue;
            }

            if (firstDigtit >= '6') {
                count++;
            }
        }

        return count;
    }
}
