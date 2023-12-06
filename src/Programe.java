import java.util.Scanner;

public class Programe {

    private static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static String convertNumberToWord(int number) {
        if (number == 0) {
            return "zero";
        }

        if (number < 0) {
            return "minus " + convertNumberToWord(Math.abs(number));
        }

        if (number < 20) {
            return units[number];
        }

        if (number < 100) {
            return tens[number / 10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
        }

        if (number < 1000) {
            return units[number / 100] + " hundred" + ((number % 100 != 0) ? " " : "") + convertNumberToWord(number % 100);
        }

        if (number < 1000000) {
            return convertNumberToWord(number / 1000) + " thousand" + ((number % 1000 != 0) ? " " : "") + convertNumberToWord(number % 1000);
        }

        if (number < 1000000000) {
            return convertNumberToWord(number / 1000000) + " million" + ((number % 1000000 != 0) ? " " : "") + convertNumberToWord(number % 1000000);
        }

        return convertNumberToWord(number / 1000000000) + " billion" + ((number % 1000000000 != 0) ? " " : "") + convertNumberToWord(number % 1000000000);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String wordFormat = convertNumberToWord(number);
        System.out.println("Word format: " + wordFormat);

        scanner.close();
    }
}
