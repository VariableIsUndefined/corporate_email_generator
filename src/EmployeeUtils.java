import java.security.SecureRandom;

public class EmployeeUtils {
    private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_LETTERS = LOWERCASE_LETTERS.toUpperCase();
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_SYMBOLS = "!@#$%";
    private static final char[] ALPHABET = (LOWERCASE_LETTERS + UPPERCASE_LETTERS + NUMBERS + SPECIAL_SYMBOLS).toCharArray();
    private static final SecureRandom secureRandom = new SecureRandom();

    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = secureRandom.nextInt(ALPHABET.length);
            password.append(ALPHABET[index]);
        }

        return password.toString();
    }
}
