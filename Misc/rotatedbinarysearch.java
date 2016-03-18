/* Suppose a sorted array is rotated at some pivot unknown to you beforehand. (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2). 
How do you find an element in the rotated array efficiently? You may assume no duplicate exists in the array. 

Answer: modified binary search - O(logn)
After the sorted array gets rotated, there are three possible conditions.
1)Number at mid index equals key. We got what we want, so return that.
2)The subarray to the left of the mid index is sorted. We can tell if the first element is less than the mid element.
3)The subarray to the right of the mid index is sorted.

*/

int rotated_binary_search(int arr[], int key){
	int low = 0;
	int high = arr.length - 1;

	while(low <= high){
		mid = low + ((high - low) / 2);

		//Condition 1
		if (arr[mid] == key) return mid;

		//Condition 2
		if (arr[low] <= arr[mid]){
			if (arr[low] <= key && key < arr[mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}

		//Condition 3
		else {
			if (arr[mid] < key && key <= arr[right]){
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
	}

}


