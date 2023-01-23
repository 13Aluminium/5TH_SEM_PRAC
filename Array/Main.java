import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        for(int num: arr){// for every element in array print the element
            System.out.println(num +" ");//here num represents element of the array
        }
        // or you can convert the array into string
        System.out.println(Arrays.toString(arr));
    }
}
