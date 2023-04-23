class Main{
    static void moveZerostoLeft(int[] arr){
        int j =0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
        for (int c = 0; c < arr.length ; c++) {
            System.out.println(arr[c]);
        }
    }
    public static void main(String[] args) {
        //example array
        int[] arr ={1,0,0,4,5};
        moveZerostoLeft(arr);
    }
}