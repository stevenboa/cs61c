public Binary_Search {
	public static int[] solution1(int[] arr, int target) {
		if(arr == null || arr.length == 0) {
			return null;
		}

		int start = 0;
		int stop = arr.length - 1;
		int left = 0;
		int right = 0;

		while(start <= stop) {
			int mid = start + (stop - start)/2;
			if(target < mid) {
				stop = mid - 1;		
			}	
			else if(target > mid) {
				start = mid + 1;
			}
			else {
				left = findLeftMost(arr, start, mid - 1);
				right = findRightMost(arr, mid + 1, stop);
			}
		}
		
		return new int[]{left, right};
	}	


	public static int findLeftMost(int arr, int start, stop) {
		int target = arr[stop + 1];
		int mid = start + (stop - start)/2;
		while(start <= stop) {
			if(target > mid) {
				start = mid + 1;
			}
			else {
				stop = mid - 1;
			}
		}
		return stop + 1;
	}

	
	public static int findRightMost(int arr, int start, stop) {
		int target = arr[stop + 1];
		int mid = start + (stop - start)/2;
		while(start <= stop) {
			if(target < mid) {
				stop = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return start - 1;
	}


	public static void main(String[] args) {
		int[] result = Binary_Search.solution1(new int[](5,7,7,8,8,10), 8);
		System.out.println(result[0] + "," + result[1]);
	}	
	


 }
