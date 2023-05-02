                                             //Check for palindrome
import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        //check for palindrome
        System.out.println("Enter Number to check for Palindrome:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String n = String.valueOf(num);
        int[] arr = new int[n.length()];
        for (int i = 0; i < n.length(); i++) {
            char c = Character.valueOf(n.charAt(i));
            int j = Character.getNumericValue(c);
            arr[i]=j;
        }
        int i = 0,j= arr.length-1;
        //in case of even i > j 
        //in case of odd i==j
        for (  ; i < j ; i++,j--) {
            if(arr[i]!=arr[j]){
                System.out.println("No!");
                break;
            }
        }
        if(i>=j){
            System.out.println("Yes!");
        }


    }
}
