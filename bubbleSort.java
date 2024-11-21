//madison.covey@malad.us

// weekFive
//instructor Mr Gross

class bubbleSort{

 public static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){
    
       int temp;
        temp=arrayToSwap[lowerIndex];
         arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];
         arrayToSwap[lowerIndex+1]=temp;
         return arrayToSwap;
        }
     public static void printArray (int [] array) { // A method to print out the array.
        for (int x=0; x < array.length; x++){
            System.out.println (array[x]);
             }
        }
    public static void main(String[] args){
    
        int[] arrayToSort={1,5,4,29,19,33,57,126,4,543,500};
        printArray (arrayToSort);
        for (int x=0; x< arrayToSort.length - 1; x++){
             for ( int y=0; y< arrayToSort.length-1-x; y++){
             if (arrayToSort [y] > arrayToSort [y+1]){ // Bottom element is bigger then the top element so swap them 
                 arrayToSort = swapTwoArrayElements (arrayToSort,y);
                }
              }
            }
        System.out.println ("sorted array");
        printArray (arrayToSort);
    }
}