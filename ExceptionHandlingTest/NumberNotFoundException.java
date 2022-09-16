package Test4_16Sep2022.ExceptionHandlingTest;

public class NumberNotFoundException extends Exception {

    public NumberNotFoundException(String message) {
        System.out.println("Please Enter a String containing Number.");
    }
}
