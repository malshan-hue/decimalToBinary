import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter the decimal number: ");
            int number = myScanner.nextInt();

            ArrayList<Integer> binary = new ArrayList<Integer>();


            while(number != 0){

                int remainder = number % 2;

                binary.add(remainder);

                number /= 2;
            }

            System.out.print("Binary number is = ");
            for(int i : binary){
                System.out.print(i + " ");
            }

        }


    }
}