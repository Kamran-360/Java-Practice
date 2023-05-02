import java.util.Scanner;

class StringSplit{
    public static  boolean checkforodd(int len){
        if(len % 2==0){return false;}
        return true;
    }
    public static void printArray(String[] arr){
        int i = 0;
        System.out.print("[");
        while (i < arr.length){
            System.out.print("\'" + arr[i] + "\'");
            i++;
            if(i<arr.length){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        //taking an example string
        System.out.println("Enter the string to make pairs :");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] arr;
        char[] characters = s.toCharArray();
        int len = characters.length;
        //handle the case for odd or even length string
        if(checkforodd(len)){arr = new String[(characters.length+1)/2];}
        else {arr = new String[characters.length/2];}
        //Logic to append the array arr
        String add = "";
        int index=0;
        for (char c:characters) {
           add = add + c;
           if(add.length() == 2){
               arr[index]= add;
               add =""; //just keep adding and cleaning the string variable add
               index++;
           }
        }
        //just in case the string is odd then add '_' with the last char of array
        if(checkforodd(len)){
            String last = characters[len-1] + "_";
            arr[arr.length-1] = last;
        }
        //print the array containing pairs
        printArray(arr);
    }
}
