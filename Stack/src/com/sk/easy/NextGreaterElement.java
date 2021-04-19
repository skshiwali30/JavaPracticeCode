/*Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation:
For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
For number 1 in the first array, the next greater number for it in the second array is 3.
For number 2 in the first array, there is no next greater number for it in the second array, so output -1.*/

package com.sk.easy;

public class NextGreaterElement {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {       
        int len = nums1.length;
        int result[] = new int[len];
        for(int i = 0; i < nums1.length; i++) {
            int greater = nums1[i];
            boolean found = false;
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    if(j == nums2.length-1){
                        result[i] = -1;
                        break;
                    }                        
                    else
                        found = true;
                }
                else if(found == true && greater < nums2[j]) {
                    result[i] = nums2[j];
                    break;
                }
                else if(found == true && j == nums2.length-1)
                   result[i] = -1;
            }
        }
        return result;
    }
}
