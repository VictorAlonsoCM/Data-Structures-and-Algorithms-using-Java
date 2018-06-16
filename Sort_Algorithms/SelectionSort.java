public class SelectionSort {

    public static void main(String[] args){
        int[] intArray = {100, 25, -20, 7, 3, 1, -50};

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largest = 0;
            //This for is used to compare the first time the intArray index 0 with intArray index = i
            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(intArray[i] > intArray[largest]){
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);

        }

        for(int i = 0; i < intArray.length; i++){
            System.out.print(" " + intArray[i] + " ");
        }

    }

    public static void swap(int[] array, int largest, int lastUnsortedIndex){

        if(largest == lastUnsortedIndex){
            return;
        }

        int temp = array[largest];
        array[largest] = array[lastUnsortedIndex];
        array[lastUnsortedIndex] = temp;
    }

}
