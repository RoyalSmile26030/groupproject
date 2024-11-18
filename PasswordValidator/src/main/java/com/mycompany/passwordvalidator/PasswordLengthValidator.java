public class PasswordLengthValidator {
    public static boolean isAtLeastEightCharacters(String password) {
        return password.length() >= 8;
    }
}
