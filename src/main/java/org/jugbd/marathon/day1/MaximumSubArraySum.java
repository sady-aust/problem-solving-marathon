package org.jugbd.marathon.day1;

/**
 * @author Bazlur Rahman Rokon
 * @since 7/3/17.
 */
public class MaximumSubArraySum {

    public static int findMaxSum(int[] arr) {

		int max_privious=0, max =0;
		
		for(int i=0;i<arr.length;i++){
			max += arr[i];
			if(max<0){
				max =0;
			}
			
			else if(max>max_privious){
				max_privious = max;
			}
		}
		
		return max_privious;
		
       
    }
	 
}
