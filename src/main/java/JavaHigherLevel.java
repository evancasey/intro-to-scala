public class JavaHigherLevel {

    public static boolean containsUpper(String name) {

        // Java – Check if string has uppercase character
        boolean hasUpperCase = false;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                hasUpperCase = true;
                break;
            }
        }

        return hasUpperCase;
    }

    public static void main(String[] args) {

        containsUpper("Hello");

    }
}


