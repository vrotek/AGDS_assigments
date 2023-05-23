package Test.Recursion;

import java.util.Arrays;

public class main {

    public static boolean bisectionSearch(int[] arr, int key, int low, int high){
        if(low > high){
            return false;
        }
        int m = (low+high)/2;
        int e = arr[m];
        if(key == e){
            return true;
        }else if(key < e){
            return bisectionSearch(arr,key,low,m-1);
        }else {
            return bisectionSearch(arr,key,m+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 0;
        System.out.println("List: " + Arrays.toString(arr) + " contains: " + k + " " + (bisectionSearch(arr,k,0,arr.length-1) ? "True":"False"));
    }
}
