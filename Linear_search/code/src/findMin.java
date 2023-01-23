public class findMin {
    public static void main(String[] args) {
        int nums[]={4,45,6435,223,4214,75,57,63,5423,4263,678,79,5,452,223,4,3,224,5,2,2,-5};
        int ans= min(nums);
        System.out.println(ans);

    }
    static int min(int arr[]){
        int min = arr[0];
        if(arr.length == 0){
            return Integer.MAX_VALUE;
                }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
        }
            else{
                continue;
            }
        }
        return min;
    }
}

