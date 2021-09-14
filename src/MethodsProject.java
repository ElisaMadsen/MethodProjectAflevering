import java.util.Scanner;
import java.util.regex.Pattern;

public class MethodsProject {
    //Task 1. Write a Java method to find the smallest number among three numbers.
    //The number should come from a user inputting 3 numbers
    public static double findSmallestNumber(double number1, double number2, double number3) {
        double smallestNumber = Math.min(Math.min(number1, number2), number3);
            return smallestNumber;
        }

    //Task 2. Write a method that as a parameter gets a number.
    //It should then print to the console if the number is negative, positive or zero.
    public static int findMathValuePositiveNegativeOrZero(int number) {
        int inputNumber = number;
        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println(number + " is neither a negative or positive number");
        }
        return inputNumber;
    }

    //Task 3.Write a method to find the middle character of a string.
    //The method should take a String as parameter.
    public static String findMiddleCharOfString(String inputString) {
        if (inputString.length() <= 2) {
            return inputString;
        }
        int indexOfStartString = (inputString.length() - 1) / 2;
        int indexOfEndString = indexOfStartString + 2 - (inputString.length() % 2);
        return inputString.substring(indexOfStartString, indexOfEndString);
    }

    //Task 4.Write a java method to calculate the area of a triangle.
    //It should take 3 sides as parameter.
    public static double findAreaOfTriangle(double sideA, double sideB, double sideC) {
        double sumOfSides = (sideA + sideB + sideC) / 2;
        double areaOfTriangle = Math.sqrt(sumOfSides * (sumOfSides - sideA) * (sumOfSides - sideB) * (sumOfSides - sideC));
        return areaOfTriangle;
    }

    //Task 5.Write a Java method to check whether an entered string is a valid password.
    public static boolean validPassword (String inputPassword){
        String password = inputPassword;
        if (password.length() < 8)  {
            System.out.println("You password is invalid, please try again😥");
            return false;
        }
        String regex = "[^a-zA-Z0-9]";
        if ((Pattern.compile(regex).matcher(password).find())){
            System.out.println("You password is invalid, please try again😥");
         return false;
        }
        if (password.contains("secret")){
            System.out.println("You password is invalid, please try again😥");
            return false;
        }
        System.out.println("Congratulations!🎉 You password is valid");
        return true;
    }

    //Task 6.Lav en metode ved navn printNumbers som tager et naturligt tal, maximum, som argument.
    //Derefter skriver den tallene fra 1 til og med maximum i firkantede paranteser.
    public static int printNumbers(int inputMaximumNumber) {
        int printedNumbers = inputMaximumNumber;
        String firkantetParantes = "";
        for (int i = 1; i <= printedNumbers; i++) {

            firkantetParantes = firkantetParantes + "[" + i + "]";
        }
        System.out.println(firkantetParantes);
        return printedNumbers;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task 1.
        System.out.println("TASK 1\n");
        //Input from user
        System.out.println("Hello👋 let's find the smallest number among three numbers. \nPlease write your first number");
        double inputFirstNumber = scanner.nextDouble();

        System.out.println("Now write your second number");
        double inputSecondNumber = scanner.nextDouble();

        System.out.println("Perfect! Now write your last number");
        double inputThirdNumber = scanner.nextDouble();

        //Using the method
        double smallestnumber = findSmallestNumber(inputFirstNumber, inputSecondNumber, inputThirdNumber);
        String smallestNumberResult = "This is the smallest number out of the three: " + smallestnumber;
        System.out.println(smallestNumberResult);

        //Task 2.
        System.out.println("TASK 2\n");
        //Using the method
        System.out.println("Please input a number");
        int inputNumber = scanner.nextInt();
        System.out.println(findMathValuePositiveNegativeOrZero(inputNumber));

        //Task 3.
        System.out.println("TASK 3\n");
        //Using the method
        System.out.println("Please input a word, so we can find the middlecharacter or characters :");

        String stringFromUser = scanner.next();
        String yourMiddleCharResult = "This is your middlecharacter or characters in your word: " + "'" + findMiddleCharOfString(stringFromUser) + "'";
        System.out.println(yourMiddleCharResult);

        //Task 4.
        System.out.println("TASK 4\n");
        //Input from user
        System.out.println("Let's calculate the area of a triangle");
        System.out.println("Please input the lenght of the first side in your triangle: ");
        double sideAInput = scanner.nextDouble();

        System.out.println("Nice! Now input the lenght of the second side of your triangle: ");
        double sideBInput = scanner.nextDouble();

        System.out.println("Awesome! Now we only need the lenght of the last side in your triangle: ");
        double sideCInput = scanner.nextDouble();

        //Using the method
        System.out.println("Now we know that '" + (findAreaOfTriangle(sideAInput, sideBInput, sideCInput) + "' is the area of your triangle!"));

        //Task 5.
        System.out.println("TASK 5\n");

        System.out.println("Let's check if your password is valid\nHere are the requirements:");
        System.out.println("1. A password must have at least eight characters");
        System.out.println("2. A password must consists of only letters and digits");
        System.out.println("3. It cannot contain the string \"secret\"");
        System.out.println("4. The first character must not be a dash (-)");

        System.out.println("Type your password here:");
        String userPassword = scanner.next();

        System.out.println(validPassword(userPassword));


        //Task 6.
        System.out.println("TASK 6\n");

        //Using the method
        System.out.println("Please type two random numbers: ");

        int userPrintInput = scanner.nextInt();
        int userPrintInput2 = scanner.nextInt();
        printNumbers(userPrintInput);
        printNumbers(userPrintInput2);

    }
}
