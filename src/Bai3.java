import java.util.Scanner;

public class Bai3 {

    public static String extractFirstDigit(int input){
        String string = String.valueOf(input);
        string = (input >= 0) ? String.valueOf(string.charAt(0)) : "-" + string.charAt(1);
        return string;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;

        try {
            System.out.print("Input an integer(positive/negative): ");
            input = Integer.parseInt(sc.nextLine());

            System.out.print("Extract the first digit from the said integer: ");
            System.out.print(extractFirstDigit(input));
        }catch (NumberFormatException ex){
            System.out.print("Invalid value");
        }
    }
}
