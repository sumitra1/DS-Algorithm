package arrayPrefix;
import java.util.*;

public class WaveSort {

	    public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        List<Integer>nums = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            nums.add(sc.nextInt());
	        }
	        List<Integer>ans = wiggleSort(n,nums);
	        for (int i = 0; i < n; i++) {
	            System.out.print(ans.get(i)+" ");
	        }
	    }

	    static List<Integer> wiggleSort(int n, List<Integer>nums){
	          
	        for(int i=0;i<n;i+=2){
	           
	                if (i>0 && nums.get(i-1)<nums.get(i)){
	                    Collections.swap(nums,i-1,i);
	                }
	                    if (i<n-1 && nums.get(i)>nums.get(i+1)){
	                    Collections.swap(nums,i,i+1);
	                    
	                }
	            
	        }
	        return nums;
	    }
	}
