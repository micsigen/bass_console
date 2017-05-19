package hipercube.pit;

/**
 * Created by bmajor on 2017. 05. 18..
 */
public class App {
    public int ValidPassword(String password) {
        int min = 8;
        int max = 32;
        int lower = 0;
        int upper = 0;
        int digit = 0;
        if (password.length() < min || password.length() > max)
            // Password length should be between 8 and 32
            return 1;
        // For each character in password
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c))
                // If character is uppercase
                lower++;
            if (Character.isUpperCase(c))
                // If character is uppercase
                upper++;
            if (Character.isDigit(c))
                // If character is digit
                digit++;
        }
        if (lower < 1 || upper < 1 || digit < 1)
            // Passwords should contain 1 or more uppercase characters, lowercase characters and digits
            return 2;
        // Password seems valid
        return 0;
    }
}
