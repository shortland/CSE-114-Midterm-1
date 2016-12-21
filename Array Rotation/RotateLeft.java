// The answers for these questions are already posted online. This is how I would answer these questions.

// Midterm 1
// Question 9

// One-dimensional Arrays
// Write a complete void method called -rotateLeft- that takes two parameters: an array of integers called -nums- and an integer -n-. The method shifts every element of nums by n places to the left, wrapping the elements around to the right side of the array.

// Example: nums = {1, 2, 3, 4, 5} => rotateLeft(nums, 3) = {4, 5, 1, 2, 3}


// using recursion, since why not.
public class RotateLeft {

	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 4, 5};
		int[] jars = rotateLeft(nums, 3);

		for(int i = 0; i < jars.length; i++) {
			System.out.print(jars[i] + " ");
		}
		System.out.println();

	}

	public static int[] rotateLeft(int[] nums, int n) {

		if(n == 0)
			return nums;
		else {
			// new array that'll have rotated contents
			int[] rotatedElms = new int[nums.length];

			for(int c = 0; c < nums.length; c++) {
				rotatedElms[c] = nums[c];
			}

			// rotate left once
			for(int i = 0; i < nums.length; i++) {
				if(i == 0) {
					rotatedElms[rotatedElms.length - 1] = nums[i];
				}
				else {
					rotatedElms[i-1] = nums[i];
				}
			}
		
			return rotateLeft(rotatedElms, n-1);
		}

	}

}