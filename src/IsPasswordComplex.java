import java.util.Scanner;

public class IsPasswordComplex {

    public static boolean isPasswordComplex(String password) { // boolean returns true value by default.
        return password.length() >= 6 &&                         //checks password is greater than 6. if not returns false
                password.matches(".*\\d.*")&&             //checks password has a number , if not returns false
                password.matches(".*[a-z].*")&&            //checks for a lower case letter, if not returns false
                password.matches(".*[A-Z].*");             //checks for an upper case letter, if not returns false
    }                                                          // if all checks return true, isPasswordComplex returns true.
    // if not, isPasswordComplex returns false
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? " +
                isPasswordComplex(userInput));
    }
}
