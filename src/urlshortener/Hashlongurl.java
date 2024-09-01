package urlshortener;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class Hashlongurl {

    private static final String BASE62 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static String userid;
    private final Map<String, String> urlMap = new HashMap<>();

    public static void main(String[] args) {
        Hashlongurl shortener = new Hashlongurl();
        userid = "jothiprakash008@gmail.com";
        // Step 1: Hash the URL and store it in a map
        String longUrl = "http://www.google.com";
        String shortUrl = shortener.shortenURL(longUrl, userid);
        shortener.urlMap.put(shortUrl, longUrl); // Store the mapping

        // Output the short URL
        System.out.println("Short URL for " + longUrl + ": " + shortUrl);

        // Step 2: Retrieve the original URL using the short URL
        String retrievedUrl = shortener.getOriginalURL(shortUrl);


        // Output the results
        System.out.println("Retrieved Original URL: " + retrievedUrl);
    }

    // Method to hash and shorten the URL with collision handling
    public String shortenURL(String longUrl, String userid) {
        String shortUrl;
        int counter = 0;

        do {
            shortUrl = generateShortUrl(longUrl + counter + userid); // Append counter for uniqueness
            counter++;
        } while (urlMap.containsKey(shortUrl)); // Check for collisions

        return shortUrl;
    }

    // Helper method to generate the short URL from the long URL
    private String generateShortUrl(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            BigInteger hashNum = new BigInteger(1, hashBytes);

            StringBuilder shortUrl = new StringBuilder();
            while (hashNum.compareTo(BigInteger.ZERO) > 0) {
                shortUrl.append(BASE62.charAt(hashNum.mod(BigInteger.valueOf(62)).intValue()));
                hashNum = hashNum.divide(BigInteger.valueOf(62));
            }

            // Ensure the short URL is exactly 7 characters long
            while (shortUrl.length() < 7) {
                shortUrl.append('a'); // Padding to ensure it's 7 characters long
            }

            return shortUrl.length() > 7 ? shortUrl.substring(0, 7) : shortUrl.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error generating hash", e);
        }
    }

    // Method to retrieve the original URL using the short URL
    public String getOriginalURL(String shortUrl) {
        return urlMap.get(shortUrl);
    }
}
