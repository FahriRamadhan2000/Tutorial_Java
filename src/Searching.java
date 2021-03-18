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

    public int BinarySearch(int[] arr, int s) {
        Arrays.sort(arr);
        /*
         * Inisiasi batas (left) dan batas (right)
         */
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            /*
             * Inisiasi nilai tengah
             */
            int mid = left + (right - left) / 2;
            /*
             * Nilai tengah sama dengan yang dicari atau tidak? 
             * Jika iya maka yang dicari telah ditemukan
             */
            if (arr[mid] == s)
                return 1;
            /*
             * Geser batas (left) ke kanan
             */
            if (arr[mid] < s)
                left = mid + 1;
            /*
             * Geser batas (kanan) ke kiri
             */
            if (arr[mid] > s)
                right = mid - 1;
        }
        /*
         * Jika yang dicari tidak ditemuakan, maka....
         */
        return 0;
    }
}