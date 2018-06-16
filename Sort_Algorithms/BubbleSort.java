public class BubbleSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22}; //Array Unsorted
        //The last unsorted element is the last position of the array
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            //start from the beginning and do not go to the ending partition
            //Because it is already sorted
            for(int i = 0; i < lastUnsortedIndex; i++){

                if(intArray[i] > intArray[i + 1]){
                    swap(intArray, i, i + 1);
                }
            }
        }

        for(int i = 0; i < intArray.length; i++){

            System.out.println(intArray[i]);
        }

    }

    public static void swap(int [] array, int i, int j){

        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        /*first {20 , -15, 7, 35, 1, -22, 55}
          second{-15, 7, 20, 1, -22, 35, 55}
          ...   {-15, 7, 1, -22, 20, 35, 55}
          ......{-15, 1, -22, 7, 20, 35, 55}
          ......{-15, -22, 1, 7, 20, 35, 55}
          ......{-22, -15, 1, 7, 20, 35, 55}
        */
    }
}
