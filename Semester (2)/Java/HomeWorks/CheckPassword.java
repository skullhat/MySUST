import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {

        // tipical pass
        checkPassword("aBcDef78");
        // more than 8
        checkPassword("ab2cdfj5hijk");
        // 7 lenghth
        checkPassword("1234567");
        // not digit or letter
        checkPassword("1234abc$");
        // only letters
        checkPassword("abcefjik");
        // 1 digit
        checkPassword("abcefi4c");
        // only digits
        checkPassword("12345678");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter password");
        checkPassword(input.nextLine());
    }

    public static void checkPassword(String pass) {
        int digitCounter = 0;
        int lettersCounter = 0;

        boolean validLenght = true;
        boolean isOnlyLettersOrDigits = true;
        boolean haveTwoDigits = true;
        boolean haveLetters = true;

        for (int i = 0; i < pass.length(); i++) {
            // check for lenght
            if (pass.length() < 8) {
                System.out.println("Invalid pass, Password must be eight char");
                validLenght = false;
                break;
            }

            // have only digits and letters
            if (!Character.isLetterOrDigit(pass.charAt(i))) {
                System.out.println("invalid pass, Must be only digit or letter");
                isOnlyLettersOrDigits = false;
                break;
            }
            // have at least two digits
            if (Character.isDigit(pass.charAt(i))) {
                digitCounter++;
            }
            if (i == pass.length() - 1 && digitCounter < 2) {
                System.out.println("invalid pass, at least tow digits");
                haveTwoDigits = false;
                break;
            }

            // have at least one letter
            if (Character.isLetter(pass.charAt(i))) {
                lettersCounter++;
            }

            if (i == pass.length() - 1 && lettersCounter < 1) {
                System.out.println("invalid pass, at least one letter");
                haveLetters = false;
                break;
            }

            // valid password
            if (i == pass.length() - 1 && validLenght && isOnlyLettersOrDigits && haveTwoDigits && haveLetters) {
                System.out.println("valid password");
            }

        }
    }

}