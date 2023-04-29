                                  //LOGIC 1 (Regular Approach)
//To check palindrome simply typecast the string word to char array and reversely traverse it and keep
//concatenating each element in the string word (here checkWord) and then return the word compare it with
//original array.
//Important : Because return statement would return the string object with copied elements from char array
//So it will create another object of string in memory and no longer pointing to the same original string
//that's why they would not be equal and comparison operator ('==') wouldn't because of having different
// memory locations but '.equals()' would work here which would match the contents in the objects instead
// of their pointing locations.
                                  //LOGIC 2 (Irregular Approach)
//IrregularApproach()   --> simply keep checking from start and end using pointers until start>array length
                                 //LOGIC (competitive Approach)
// competitiveApproach --> is a recursive approach
import java.util.Scanner;
class Main{
   //regular mindset approach
    static String regularApproach(String word){
        char[] arr = word.toCharArray();
        String checkWord ="";
        for(int i = arr.length-1 ; i>=0 ; i--){
            checkWord = checkWord + arr[i];
        }
        return checkWord;
    }

    //irregular approach
    static boolean IrregularApproach(String word){
        char[] arr = word.toCharArray();
        int Start = 0;
        int End = word.length()-1;
        while (Start<End){
            if(arr[Start] != arr[End]) {
                return false;
            }
            Start++;
            End--;
        }
        return true;
    }


   //competitiveApproach
    static boolean competitiveApproach(char[] arr,int Start ,int End){
       if(Start > End){
           return true;
       }
       if(arr[Start] != arr[End]){
         return false;
       }
       Start++; End--;
       return competitiveApproach(arr,Start,End);
   }

   //main
    public static void main(String[] args) {
        System.out.println("Enter String to check for palindrome : ");
        Scanner in = new Scanner(System.in);
        String word = in.next();
        System.out.println("With Regular Approach :");
        String c = regularApproach(word);
        if(c.equals(word)){
            //why it didn't work with comparison operator == to compare or why 'equals' in if statement? go to important note on top
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        //with competitive approach func
        boolean isTrue = IrregularApproach(word);
        System.out.println("With Irregular Approach :");
        if(isTrue == true){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        char[] arr = word.toCharArray();
        int Start =0;
        int End = word.length()-1;
        System.out.println("With Competitive Approach : ");
        boolean isPalin = competitiveApproach(arr,Start,End);
        System.out.println(isPalin);
    }
}




