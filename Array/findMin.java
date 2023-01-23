public class findMin {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        System.out.println(minum(arr));
    }
    static int minum(int[] arr){
        int minu=arr[0];
        for (int i = 1; i < arr.length; i++) {

            if(minu>arr[i]){
                minu=arr[i];
            }
        }
        return minu;
    }
}
