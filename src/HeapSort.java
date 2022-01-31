
public class HeapSort {
	 public static void main(String[] args) {
		 int[] unsorted = {5,3,1,2,4};
		 for(int num : unsorted) {
			 System.out.print(num + " ");
		 }
		 
		 
		 heapifyDown(unsorted);
		 System.out.println("Sorted...");
		 for(int num : unsorted) {
			 System.out.print(num + " ");
		 }
	}
	 
	//return parentIndex
	public static int getParentIndex(int childIndex) {
		//formula to get parent from the child index
		return (childIndex-1)/2;
	}
	
	public static int getLeftChild(int parentIndex) {
		//formula to get left child from the parent index
		return parentIndex*2+1;
	}
	

	
	public static int getRightChild(int parentIndex) {
		//formula to get right child from the parent index
		return parentIndex*2+2;
	}
	
	public static boolean hasLeftChild(int[] arr,int parentIndex) {
		return getLeftChild(parentIndex)<arr.length;
	}
	
	public static boolean hasRightChild(int[] arr,int parentIndex) {
		return getRightChild(parentIndex)<arr.length;
	}
	
	public static void swap(int[] arr,int indexOne,int indexTwo) {
		int temp = arr[indexOne];
		arr[indexOne] = arr[indexTwo];
		arr[indexTwo] = temp;
	}
	
	public static void heapifyDown(int[] arr) {
		int index = 0;
		while (hasLeftChild(arr, index)) {
			int smallerChild = getLeftChild(index);
			if(hasRightChild(arr, index) && arr[getRightChild(index)] < arr[smallerChild]) {
				smallerChild = getRightChild(index);
			}
			
			if(arr[index] > arr[smallerChild]) {
				swap(arr,index,smallerChild);
			}else {
				break;
			}
			index = smallerChild;
		}
	}
}
