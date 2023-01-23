public class searchInRange {
    public static void main(String[] args) {
        int [] nums= {123,42,53,35,35,35,123,3,53,2,452,31,235,457,78,78,4321,325,57,7};
        System.out.println(linearSearch(nums,42,1,4));

    }


    static boolean linearSearch(int arr[], int target , int start, int end){
        if(arr.length == 0){
            return false;

        }
        //run a loop
        for(int index =start ;index<=end;index++){
            int element = arr[index];
            if(element == target){
                return true;
            }

        }
        return false;
    }
}
