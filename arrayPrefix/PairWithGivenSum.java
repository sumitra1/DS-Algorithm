package arrayPrefix;
import java.util.*;
public class PairWithGivenSum {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        boolean res = twoSumInSortedArray(n, arr, k);

        String ans = (res) ? "Present" : "Not Present";

        System.out.println(ans);

    }

    static boolean twoSumInSortedArray(int n, int arr[], int k) {
        Arrays.sort(arr);
         int l=0;
         int r=n-1;

         while(l<r){
             if(arr[l]+arr[r]>k && l<r ){
                 r--;
             }else if(arr[l]+arr[r]<k && l<r){
                 l++;
             }if((arr[l]+arr[r]==k) && l<r){
                return true;
                
             }
              
       
         } 
          return false;
    }

}

