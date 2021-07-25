package lab6;
/* 
 * @author MorphiceGV
 */
public class RecursionExercises {
	
	/**
	 * Given an integer n, find the sum of the series 1^1 + 2^2 + 3^3 + бн.. + n^n 
	 * using recursion.
	 * @param n 
	 * @return the sum of the series 1^1 + 2^2 + 3^3 + бн.. + n^n 
	 */
	public static double sum(int n)
	{
		//assume N is always positive 
		//start at 1 
		//power of 1 ==1 
		// process take N^N for highest value
		// sum(n-1) for next iteration of the series 
		// 10^10 + 9^9 
		double sum = 0; 
	if (n==1)
		return 1; 
	else
		sum = (Math.pow(n, n) + sum (n-1));
	return sum;
	
	//return (Math.pow(n,n) + sum (n-1));
		
	}
	
	
	/**
	 * Climbing stairs Problem: @restriction: Each time can climb 1, 2 or 3 steps.
	 * @param n - total number of steps
	 * @return the number of distinct ways from bottom to top
	 */
	public static long climbStairs(int n)
	{
// when its 1 step 1 way to climb similar to 0 
// if # of steps == 2 then its two ways to climb , 1 step at a time or 1 double step for total of 2 ways 
// if it does not fall into these cases do climbStairs(n - 3) + climbStairs(n-2) + climbStiars(n-1);
// the reason for this is to take advantage of the 3 steps first, then 2 steps , then a single step 
	if(n == 1 || n== 2 )	
	{
		return n;
	}
	else if (n == 3)
	{
		return 4; 
	}
	else 
		return climbStairs(n-1)+ climbStairs(n-2)+ climbStairs(n-3); 
		
	}
	/**
	 * Find the index of the given target in sorted array (assume no duplicated elements)
	 * Example: (arr = [1 2 4 7 9], target = 7, start = 0, end = 4)  return true
	 * @param arr
	 * @param target
	 * @param start - starting index
	 * @param end - ending index
	 * @return true the given target in sorted array or false if not found
	 */
	public static boolean  binSearchTarget(int[] arr, int target, int start, int end)
	{
		// if array is empty == false 
		// reduce array by half depending if target < or >> current value at half way 
		//in case the mid point == target number return true 
		// other wise if target is < mid number continue sorting and reduce -1 
		// similarly if its greater continue sorting adding 1 to half index to skip through 
if(start > end )
		{
			return false; 
		}
int half = (start + end)/2; 
if(arr[half] == target)
	{
	return true;
	}
else if (target < arr[half])
	{
		return binSearchTarget(arr,target,start,half-1);
	}
		return binSearchTarget(arr,target, half+1, end); 	
	}	

	
	public static int numCoinChange(int N, int[] S)
	{
		// hint: You feel free to add any helper function
				
		return 0; // remove this line after your implementation
		
	}
}
