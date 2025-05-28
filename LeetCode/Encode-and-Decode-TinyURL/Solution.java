public class Codec {
    private static final String BASE_HOST = "http://tinyurl.com/";
    private static final String CHAR_SET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int BASE = CHAR_SET.length();
    private int counter = 1;
    private Map<String, String> shortToLong = new HashMap<>();
    private Map<String, String> longToShort = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (longToShort.containsKey(longUrl)) {
            return BASE_HOST + longToShort.get(longUrl);
        }
        String shortKey = generateShortKey(counter++);
        shortToLong.put(shortKey, longUrl);
        longToShort.put(longUrl, shortKey);
        return BASE_HOST + shortKey;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String shortKey = shortUrl.replace(BASE_HOST, "");
        return shortToLong.get(shortKey);
    }

    // Helper to convert an integer counter to a short key using base62 encoding
    private String generateShortKey(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(CHAR_SET.charAt(num % BASE));
            num /= BASE;
        }
        return sb.reverse().toString();
    }
}


// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));