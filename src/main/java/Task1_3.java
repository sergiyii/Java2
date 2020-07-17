import java.util.Scanner;

/**
 * @author Sergey Filimonov
 * @see #calculator() - Method of calculator
 * @see #findMaxWordArray() - Method find max word of array
 */
public class Task1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        String task = scan.next();

        switch (task) {
            case "1":
                calculator();
                break;
            case "2":
                findMaxWordArray();
                break;
        }
        scan.close();
    }

    /**
     * Method of calculator
     */
    private static void calculator() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double number1 = scan.nextDouble();
        System.out.println("Enter the second number:");
        double number2 = scan.nextDouble();
        System.out.println("Enter the operation: (\"+\" - addition, \"-\" - subtraction, \"*\" - multiplication, \"/\" - division)");
        String operation = scan.next();
        switch (operation) {
            case "+":
                System.out.printf("Sum is: %.4f", add(number1, number2));
                break;
            case "-":
                System.out.printf("Difference is: %.4f", sub(number1, number2));
                break;
            case "*":
                System.out.printf("Product is: %.4f", mult(number1, number2));
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Devide by zero!");
                    break;
                }
                System.out.printf("Quotient is: %.4f", divis(number1, number2));
                break;
        }
        scan.close();

    }

    /**
     *
     * @param num1 - dividend
     * @param num2 - divisor
     * @return quotient
     */
    private static double divis(double num1, double num2) {
        return num1 / num2;
    }

    /**
     *
     * @param num1 - multiplicanda
     * @param num2 - multiplier
     * @return product
     */
    private static double mult(double num1, double num2) {
        return num1 * num2;
    }

    /**
     *
     * @param num1 - addend 1
     * @param num2 - addend 2
     * @return sum
     */
    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     *
     * @param num1 - minuend
     * @param num2 - subtrahend
     * @return difference
     */
    private static double sub(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Method find max word of array
     */
    private static void findMaxWordArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int lengthArr = scan.nextInt();
        System.out.println("Enter element of array: ");
        String[] myArr = new String[lengthArr];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = scan.next();
        }
        int maxLength = findMaxLengthWord(myArr);
        System.out.println("Maximal length of word: " + maxLength);

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i].length() == maxLength) {
                System.out.println("Index of word maximum length and word: [" + i + "] - " + myArr[i]);
            }
        }
        scan.close();

    }

    /**
     *
     * @param myArr - array string
     * @return maximal length of word
     */
    private static int findMaxLengthWord(String[] myArr) {
        int maxL = myArr[0].length();
        for (int i = 1; i < myArr.length; i++) {
            maxL = (maxL < myArr[i].length()) ? myArr[i].length() : maxL;
        }
        return maxL;
    }

}
