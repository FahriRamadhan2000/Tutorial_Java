import java.util.Arrays;

class Searching {
    public int LinearSearch(int[] arr, int s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                return 1;
            }
        }
        return 0;
    }

    public int BinarySearch (int [] arr, int s) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while (left<=right) {
            int mid = (right+left)/2;
            if (arr[mid] == s) {
                return 1;
            }
            if (arr[mid] < s) {
                right = mid-1;
            }

            if (arr[mid] > s) {
                left = mid+1;
            }
        }
        return 0;
    }
}