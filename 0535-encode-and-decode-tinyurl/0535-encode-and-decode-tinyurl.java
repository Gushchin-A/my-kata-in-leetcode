public class Codec {
    private final String urlTemplate = "http://tinyurl.com/";
    private final Map<String, String> urlPairs = new HashMap<>();
    private final Map<String, String> cache = new HashMap<>();

    private static final String CHARS =
            "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private final Random generator = new Random();

    public String encode(String longUrl) {
        if (cache.containsKey(longUrl)) {
            return cache.get(longUrl);
        }

        String hashPart;
        String shortUrl;

        while (true) {
            hashPart = createHash();
            shortUrl = urlTemplate + hashPart;

            if (!urlPairs.containsKey(shortUrl)) {
                break;
            }
        }

        urlPairs.put(shortUrl, longUrl);
        cache.put(longUrl, shortUrl);

        return shortUrl;
    }

    public String decode(String shortUrl) {
        return urlPairs.get(shortUrl);
    }

    private String createHash() {
        StringBuilder result = new StringBuilder();
        final int maxChars = 6;

        int i = 0;
        while (i < maxChars) {
            result.append(CHARS.charAt(generator.nextInt(CHARS.length())));
            i++;
        }

        return result.toString();
    }
}