package TDD;

public class PasswordChecker {

    public static void passwordLength(String input){
        int length=input.length();

        if(length< 6){
            throw new RuntimeException("Your password must have a minimum of 6 characters");
        }
    }

    public static boolean containsDigit(final String aString)
    {
        if (aString != null && !aString.isEmpty())
        {
            for (char c : aString.toCharArray())
            {
                if (!containsDigit(aString)) {
                    throw new RuntimeException("Password must contain at least one digit");
                }
            }
        }
        return true;
    }

    public static boolean passwordFirstCharUpperCase(String input) {
        if (!Character.isUpperCase(input.charAt(0))) {
            throw new RuntimeException("First letter must be upper case.");
        }
        return true;
    }

}
