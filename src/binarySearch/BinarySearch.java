package binarySearch;

/**
 * BinarySearch.java
 * <p>
 * Created by lijiankun on 2019-03-11.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5};
        System.out.println(solution1(arrays, 4));
    }

    private static int solution1(int[] arrays, int target) {
        if (arrays == null || arrays.length == 0) return -1;
        int left = 0, right = arrays.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arrays[mid] < target) left = mid + 1;
            if (arrays[mid] >= target) right = mid - 1;
        }
        return left;
    }
}
