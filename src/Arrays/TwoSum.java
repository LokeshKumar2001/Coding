package Arrays;

import java.util.HashMap;
import java.util.Map;
/*
 * LeetCode Link: https://leetcode.com/problems/two-sum/description/
 * Explanation: https://www.youtube.com/watch?v=BoHO04xVeU0&t=3s
 */
public class TwoSum {
	//BruteForce Approach
	// [1,2,3,4,5,6,7,8,9,10] 1+9,2+8,3+7,4+6,5+5 not possible target==10
	public static int[] twoSum(int[] nums,int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				int complement=target-nums[i];
				if(nums[j] == complement) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No Match Found");
	}

	public static int[] twoSum1(int[] nums,int target) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			int complement = target-nums[i];
			
			if(map.containsKey(complement)) {
				return new int[]{map.get(complement),i};
			}
			map.put(nums[i], i);
			
		}
		throw new IllegalArgumentException("No Match Found");
	}
	
	public static void main(String[] args) {
		int[] arr= {2,7,11,15};
		int target=9;
		
		//BruteForce Approach
		int[] res = twoSum(arr,target);
		
		//Better Approach
		int[] res1=twoSum1(arr, target);
		
		for(int e: res1)
		  System.out.print(e+" ");
		
		
	}

}
