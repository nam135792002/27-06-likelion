
import java.io.IOException;
import java.util.Scanner;

public class Bai2 {

    public static boolean checkAllDigitsEven(int input){
        if(input == 0) return false;
        while (input > 0){
            int result = input % 10;
            input /= 10;
            if(result % 2 == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;

        try {
            System.out.print("Input an integer: ");
            input = Integer.parseInt(sc.nextLine());

            System.out.println("Check whether every digit of the said integer is odd or not!");
            System.out.print(checkAllDigitsEven(input));
        }catch (NumberFormatException ex){
            System.out.print("Invalid value");
        }
    }
}
