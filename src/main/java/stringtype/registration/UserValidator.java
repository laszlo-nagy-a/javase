package stringtype.registration;

public class UserValidator {
    public boolean isValidUserName(String userName) {
        return userName.length() > 0;
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.length() >= 8 && password1.equals(password2);
    }

    public boolean isValidEmail(String email) {
        int indexOfSign = email.indexOf("@");
        int indexOfDot = email.indexOf(".");

        return indexOfSign > 0 && (indexOfDot > indexOfSign && (indexOfDot < email.length() - 1));
    }
}
