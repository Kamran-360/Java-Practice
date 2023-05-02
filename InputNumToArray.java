                      //To convert an input number into an array and then we are validating for the armstrong characteristic of numbers.
import java.util.Scanner;

class CheckArmStrongNumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int number = input;
        //converting the number to array
        String characters = String.valueOf(number);
        int len = characters.length();
        int[] arr = new int[len];
        for (int i = 0; i < len ; i++) {
            char ch = Character.valueOf( characters.charAt(i));
            arr[i] = Character.getNumericValue(ch);
        }
        double sumOfSquare=0;
        for (int a : arr) {
            sumOfSquare = sumOfSquare + (Math.pow(a,len));
        }
        if(sumOfSquare == number){

            System.out.println("The number is an armstrong number.");
        }
        else {
            System.out.println("It's not an armstrong number");
        }

    }
}
