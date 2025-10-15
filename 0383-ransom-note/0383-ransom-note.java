class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] arrayRansomNote = ransomNote.toCharArray();
        Arrays.sort(arrayRansomNote);

        char[] arrayMagazine = magazine.toCharArray();
        Arrays.sort(arrayMagazine);

        int i = 0;
        int j = 0;
        while (i < arrayRansomNote.length) {
            if (arrayRansomNote[i] == arrayMagazine[j]) {
                i++;
                j++;
            } else {
                j++;
            }
            if (j >= arrayMagazine.length && i < arrayRansomNote.length) {
                return false;
            }
        }

        return true;
    }
}
