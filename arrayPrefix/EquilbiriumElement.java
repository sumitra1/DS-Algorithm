package arrayPrefix;
import java.util.Scanner;

public class EquilbiriumElement {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

        int res = equalPartition(n, arr);

        System.out.println(res);

    }

    static int equalPartition(int n, long a[]) {
        long rightSum=0;
        long leftSum=0;
        long sum=0;
        
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        rightSum=sum;
        int i=0;
       
        for(;i<n;i++){
            rightSum=rightSum-a[i];
            if(leftSum==rightSum){
               return i;
            }
            else{
                leftSum=leftSum+a[i];
            }
        }
        return -1;
    }

}
