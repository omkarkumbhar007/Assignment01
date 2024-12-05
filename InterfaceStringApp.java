package com.practiceCode.Test;
import java.util.*;


interface StringTemplate {

    // Default method to set the string value
   default void setString(String s) {
        // Default implementation (could be empty if not needed)
    }

    // Abstract method to get the result based on the child class implementation
    public abstract int getResult();
}


 class FindVowelCount implements StringTemplate {
    private String str;

    // Override setString to store the string
    @Override
    public void setString(String s) {
        this.str = s;
    }

    // Override getResult to find and return the number of vowels
    @Override
    public int getResult() {
        int vowelCount = 0;
        // Define vowels
        String vowels = "aeiouAEIOU";
        
        // Count vowels in the string
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}

 class ExtractDigit implements StringTemplate {
    private String str;

    // Override setString to store the string
    @Override
    public void setString(String s) {
        this.str = s;
    }

    // Override getResult to extract digits and calculate their sum
    @Override
    public int getResult() {
        int digitSum = 0;

        // Extract digits and sum them
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digitSum += Character.getNumericValue(str.charAt(i));
            }
        }
        return digitSum;
    }
}


 class StringOperation {

    // Method to perform the operation and display the result
    public void performOperation(StringTemplate template, String typeOfResult) {
        int result = template.getResult();
        
        // Display the result based on the type of result
        if (typeOfResult.equals("Vowel Count")) {
            System.out.println("Number of vowels: " + result);
        } else if (typeOfResult.equals("Digit Sum")) {
            System.out.println("Sum of all digits is: " + result);
        } else {
            System.out.println("Invalid result type.");
        }
    }
}


 public class InterfaceStringApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Case 1: Find Vowel Count
        System.out.println("Enter a string to find the number of vowels: ");
        String inputString1 = scanner.nextLine();
        
        // Create an instance of FindVowelCount
        FindVowelCount findVowel = new FindVowelCount();
        findVowel.setString(inputString1); // Set the string
        StringOperation operation = new StringOperation();
        operation.performOperation(findVowel, "Vowel Count"); // Perform the operation
        
        // Case 2: Extract Digit Sum
        System.out.println("\nEnter a string to extract and sum digits: ");
        String inputString2 = scanner.nextLine();
        
        // Create an instance of ExtractDigit
        ExtractDigit extractDigit = new ExtractDigit();
        extractDigit.setString(inputString2); // Set the string
        operation.performOperation(extractDigit, "Digit Sum"); // Perform the operation
    }
}
