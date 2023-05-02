                                        //Creating Matrix and taking transpose of it also it handles inputs for the user's ease

import java.util.Scanner;
class Matrix{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int rows = in.nextInt();
        System.out.println("Enter Columns : ");
        int cols = in.nextInt();
        //2D array for matrix
        int[][] Matrix = new int[rows][cols];
        System.out.println("Enter the values for the matrix:");
        in.nextLine();
        for (int row = 0; row < Matrix.length ; row++){
            String input = in.nextLine();
            String[] values = input.split(" ");
            for (int col = 0; col < Matrix[row].length ; col++) {
                Matrix[row][col] = Integer.parseInt(values[col]);
            }
        }
        System.out.println("The Transpose of Matrix is :");
      //For transpose change rows to cols and cols to rows
        for (int i = 0; i < cols ; i++) { //upto number of rows
            for (int j = 0; j < rows ; j++) {//upto number of cols
                System.out.print(Matrix[j][i]+"   ");
            }
            System.out.println();
        }
    }
}
