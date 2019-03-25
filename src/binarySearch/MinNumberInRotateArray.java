package binarySearch;

/**
 * MinNumberInRotateArray.java
 * <p>
 * Created by lijiankun on 2019-03-13.
 */
public class MinNumberInRotateArray {

    public static void main(String[] args) {
        int[] arrays = new int[]{3, 4, 5, 1, 2};
        System.out.println(solution1(arrays));
    }

    private static int solution1(int[] arrays) {
        if (arrays == null || arrays.length == 0) {
            return -1;
        }
        int left = 0, right = arrays.length - 1;
        while (left <= right) {
            if (right - left == 1) {
                return right;
            }
            int mid = left + (right - left) / 2;
            if (arrays[left] < arrays[mid]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return -1;
    }
}
