public class Codec {
    private final String urlTemplate = "http://tinyurl.com/";
    private Map<String, String> urlPairs = new HashMap<>();
    private Map<String, String> cache = new HashMap<>();

    public String encode(String longUrl) {
        if (cache.containsKey(longUrl)) {
            return cache.get(longUrl);
        }

        String hashPart = createHash(longUrl);
        String shortUrl = urlTemplate + hashPart;

        urlPairs.put(shortUrl, longUrl);
        cache.put(longUrl, shortUrl);

        return shortUrl;
    }

    public String decode(String shortUrl) {
        return urlPairs.get(shortUrl);
    }

    private String createHash(String longUrl) {
        int hash = longUrl.hashCode();
        int small = Math.abs(hash / 10_000);

        List<Character> temp = new ArrayList<>();
        int num = small;
        while (num > 0) {
            int digit = num % 10;
            temp.add((char) (digit + '0'));
            num = num / 10;
        }
        char first = temp.getFirst();
        char last = temp.getLast();
        temp.set(0, (char) (first + '0'));
        temp.set(temp.size() - 1, Character.toUpperCase((char) (last + '0')));

        Collections.shuffle(temp);

        StringBuilder result = new StringBuilder();
        for (char c : temp) {
            result.append(c);
        }

        return result.toString();
    }
}