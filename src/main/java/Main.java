import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Valid length: "+isValidLength("password"));
    }

    public static boolean isValidLength(String password) {
        return password.length() >= 8;
    }

    public static boolean containsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpperAndLowerCase(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (hasUpper && hasLower){
                return true;
            }
        }
        return false;
    }

    public static boolean isWeakPassword(String password) {
        Set<String> weakPasswords = new HashSet<>();
        weakPasswords.add("password");
        weakPasswords.add("Password1");
        weakPasswords.add("Password2");
        weakPasswords.add("Aa3456789");

        return weakPasswords.contains(password);
    }

    public static boolean containsSpecialCharacter(String password) {
        String specialCharacters="!§$%&/()=?`#'*[]|{}≠¿¡“¶¢<>'^°";
        for (char c : password.toCharArray()) {
            if (specialCharacters.indexOf(c)>=0) {
                return true;
            }
        } return false;
    }
}
