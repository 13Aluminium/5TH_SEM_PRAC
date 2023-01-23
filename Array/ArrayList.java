import java.sql.SQLOutput;

public class ArrayList {
    public static void main(String[] args) {
        int nums[] = {23,45,2,2,19,-3,156, 11,28};
         int target =199;
         int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    //search in attay :return the index id item found
    // othe5rwise if item not found return -1
    static int linearSearch(int[] arr,int target){
        if(arr.length ==0){
            return -1;
        }
        //run a for loop
        for (int index = 0; index < arr.length ; index++) {
            //check for elemetn at evry index if it is = target\
 int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;

    }
}
