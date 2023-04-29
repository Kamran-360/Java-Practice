                                                                 //LOGIC Explaination
// Take two pointer one for 0 check (In this case int j = 0) another one concerns for non zero check (int i = 0) when one points to zero and the other to non zero,"SWAP"
// them.Other wise keep moving them but if 0 check pointer pointing zero stay there untill non zero check pointer finds the non zero one otherwise keep moving the jth 
// pointer too.....
class Main{
    static void moveZerostoLeft(int[] arr){
        int j =0;
        for (int i = 0; i < arr.length ; i++) {
            //if ith pointer is pointing to non zero element and jth to zero,"SWAPING"
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
            //if jth pointer pointing to non-zero keep moving the jth pointer
            if(arr[j] != 0){
                j++;
            }
        }
        //printing the new array
        for (int c = 0; c < arr.length ; c++) {
            System.out.println(arr[c]);
        }
    }
    public static void main(String[] args) {
        //example array
        int[] arr ={1,0,0,4,5};
        //calling the static moveZerostoLeft(int[] arr) function
        moveZerostoLeft(arr);
    }
}
