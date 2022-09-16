package Test4_16Sep2022.ExceptionHandlingTest;

public class NumberOutOfRangeException extends Exception{

    public NumberOutOfRangeException(String message) {
        System.out.println("Entered Number is out of Range .");
    }

}
