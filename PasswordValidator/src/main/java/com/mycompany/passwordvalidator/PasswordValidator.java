public class PasswordValidator {
    public static void main(String[] args) {
        String password = "P@ssw0rd"; // Replace with user input or test cases

        boolean isValidLength = PasswordLengthValidator.isAtLeastEightCharacters(password);
        boolean hasUpperCase = UpperCaseVaildator.containsUpperCase(password);
        boolean hasSpecialChar = SpecialCharacterValidator.containsSpecialCharacter(password);

        if (isValidLength && hasUpperCase && hasSpecialChar) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
            if (!isValidLength) {
                System.out.println("- Password must be at least 8 characters long.");
            }
            if (!hasUpperCase) {
                System.out.println("- Password must contain at least one uppercase letter.");
            }
            if (!hasSpecialChar) {
                System.out.println("- Password must contain at least one special character.");
            }
        }
    }
}
