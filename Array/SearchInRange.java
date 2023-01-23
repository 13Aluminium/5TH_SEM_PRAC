public class SearchInRange {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
       int r1 = 2;
        int r2 = 4;
        int target = 99;
        System.out.println(search(arr,r1,r2,target));
    }
    static boolean search(int []arr,int r1,int r2,int target){

        for(int i = r1; i<= r2;i++){
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }
}
