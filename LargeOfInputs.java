//Write a program that can find the sum and average of all numbers entered by user. (User shouldenter -999 to terminate the input). 
//The program should also displays the Largest and Smallest numberamong these numbers

import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i!=-999){
            i = in.nextInt();
            list.add(i);
        }
        int large = 0,sum = 0 ,num = 0,small=list.get(0);
        System.out.println("The input values were : ");
        for (Object x :list) {
            int element = (int)x;
            num ++ ;
            if(element != -999){
                System.out.print(element + " ");
                sum = sum + element;
            }
            if(small>element && element != -999){
                small = element;
            }
            if (element > large){
                large = element;
            }
        }
        System.out.println("\nThe sum and average of numbers is "+ sum + " and " + sum/num + " respectively.");
        System.out.println("The " +  large + " is the largest of inputs.");
        System.out.println("The " +  small + " is the smallest of inputs.");
    }
}
