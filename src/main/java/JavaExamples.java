/**
 * The HelloWorldApp class implements an application that
 * simply displays "Hello World!" to the standard output.
 */
class JavaExamples {

    public static int factorial(int n) {
        int product = 1;
        for (int i = 1; i <=n; i++) {
            product *= i;
        }

        return product;
    }
    public static void main(String[] args) {

       factorial(5);

    }
}
