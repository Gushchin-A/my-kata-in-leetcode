class Solution {
    private final static Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

    public String toGoatLatin(String sentence) {
        StringBuilder result = new StringBuilder();
        StringBuilder aLetter = new StringBuilder();

        for (String w : sentence.split(" ")) {
            aLetter.append("a");

            if (vowels.contains(Character.toLowerCase(w.charAt(0)))) {
                result.append(w);
                result.append("ma");
                result.append(aLetter);
                result.append(" ");
            } else {
                result.append(w.substring(1));
                result.append(w.charAt(0));
                result.append("ma");
                result.append(aLetter);
                result.append(" ");
            }
        }

        result.setLength(result.length() - 1);

        return result.toString();
    }
}