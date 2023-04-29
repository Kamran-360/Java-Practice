                                       //Find the missing element in first n natural numbers array                                    
                                                               //Logic
//To find missing one keep subtracting the remaining elements in the array so we would be ended-up
// with the missing element
class Main{
    static int FindtheMissingOne(int arr[]){
        //cal size of array
        int sizeOfarray = arr.length;
        //As arr has one missing element adding one to size
        int n = sizeOfarray + 1;
        System.out.println("Total N numbers were : "+ n);
        //As we know to calculate first n natural numbers we hava a mathematical formula n(n+1)/2
        int sumOfNumbers = (n* (n+1))/2;
        int missing_element = sumOfNumbers;
        for (int i = 0; i <arr.length ; i++) {
            missing_element = missing_element - arr[i];
        }
        return missing_element;

    }
    public static void main(String[] args) {
        //example array
        int[] a = {1,2,3,4,5,6,7,8,9,10,12,13};
        //if we calculate the sum of first 5 natural numbers would be 15
        // so array consist of first 5 numbers but one element is missing from the array
        int missingElement = FindtheMissingOne(a);
        System.out.println("The missing element was : " + missingElement);
    }
}
