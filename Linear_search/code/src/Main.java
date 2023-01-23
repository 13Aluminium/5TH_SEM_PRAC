import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int[] nums = {12,34,13,5,64,23,6,586,78,-12,74,-64};
        int target = 64;
        int x=linearSearch2(nums,target);
        System.out.println(x);
    }

    //search in the array:return the index if the item is found
    //return -1 if the item is not found
//    static int linearSearch(int arr[], int target){
//        if(arr.length == 0){
//            return -1;
//
//        }
//        //run a loop
//        for(int index =0 ;index<arr.length;index++){
//            int element = arr[index];
//            if(element == target){
//                return index;
//            }
//
//        }
//        return -1;
//    }
//}
    static int linearSearch2(int arr[], int target){
        if(arr.length == 0){
            return -1;

        }
        //run a loop
        //this is a enhanced for loop

        for (int element : arr) {
            if (element == target) {
                return element;
            }

        }
        //if -1 is the element in the array
        return Integer.MAX_VALUE;
    }
}
