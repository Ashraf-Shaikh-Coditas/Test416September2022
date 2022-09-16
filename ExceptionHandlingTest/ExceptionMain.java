package Test4_16Sep2022.ExceptionHandlingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please Enter your String : ");
        String userString = bufferedReader.readLine();

        System.out.println("Please Enter your Number : ");
        int userNumber = Integer.parseInt(bufferedReader.readLine());

        boolean flag = false;
        int sumGenerated = 0;

        for (int outer = 0; outer < userString.length(); outer++) {
            char c = userString.charAt(outer);

            if (Character.isDigit(c)) {
                flag = true;
                String temp = "";
                temp += c;
                sumGenerated += Integer.parseInt(temp);
            }

        }

        try {
            if (!flag) {
                throw new NumberNotFoundException("Enter valid input : ");
            }

            if (userNumber > sumGenerated) {
                throw new NumberOutOfRangeException("Please enter number in range");
            }
        } catch (NumberNotFoundException e) {
            e.getMessage();
            e.printStackTrace();
        } catch (NumberOutOfRangeException e) {
            e.getMessage();
            e.printStackTrace();
        } finally {
            System.out.println("User inputted number is :: " + userNumber);
            System.out.println("Sum Generated is :: " + sumGenerated);
        }


    }


}

// ABC1D2 USM29 QN1