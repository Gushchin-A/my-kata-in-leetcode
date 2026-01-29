class Solution {
    public int numUniqueEmails(String[] emails) {
        int n = emails.length;
        Set<String> uniqEmails = new HashSet<>();

        for (int i = 0; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            String email = emails[i];
            for (int j = 0; j < email.length(); j++) {
                char current = email.charAt(j);

                if (current == '+') {
                    while (email.charAt(j) != '@') {
                        j++;
                    }
                    temp.append(email.substring(j));
                    uniqEmails.add(temp.toString());
                    break;
                }

                if (current == '@') {
                    temp.append(email.substring(j));
                    uniqEmails.add(temp.toString());
                    break;
                }

                if (current != '.') {
                    temp.append(current);
                }
            }
        }
        
        return uniqEmails.size();
    }
}