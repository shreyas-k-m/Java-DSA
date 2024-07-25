public class MergSortAlpha {

    // Function to merge sort 2 arrays
    public static String[] mergsort(String[] arr, int lo, int hi) {
        if (lo == hi) {
            String[] A = {arr[lo]};
            return A;
        }
        int mid = lo + (hi - lo) / 2;
        String[] arr1 = mergsort(arr, lo, mid);
        String[] arr2 = mergsort(arr, mid + 1, hi);

        return merge(arr1, arr2);
    }

    // Merge two sorted arrays
    static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n];

        int idx = 0;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                arr3[idx++] = arr1[i++];
            } else {
                arr3[idx++] = arr2[j++];
            }
        }

        while (i < m) {
            arr3[idx++] = arr1[i++];
        }
        while (j < n) {
            arr3[idx++] = arr2[j++];
        }

        return arr3;
    }

    // Check if str1 appears before str2 in alphabetical order
    static boolean isAlphabeticallySmaller(String str1, String str2) {
        return str1.compareTo(str2) < 0;
    }

    public static void main(String args[]) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        String[] a = mergsort(arr, 0, arr.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
