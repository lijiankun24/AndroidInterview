package strings;

/**
 * Palindrome.java
 * <p>
 * Created by lijiankun on 2019-04-05.
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(solution4("BAA"));
    }

    // 马拉车算法
    private static String solution4(String origin) {
        if (origin == null || origin.length() == 0) return "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#");
        for (int i = 0; i < origin.length(); i++) {
            stringBuilder.append(origin.charAt(i)).append("#");
        }

        int curCenter = 0, curIndex = 0;
        int maxLength = 0, start = 0;
        int[] arrays = new int[stringBuilder.toString().length()];
        for (int i = 1; i < stringBuilder.length() - 1; i++) {

            arrays[i] = i < curIndex ? Math.min(arrays[2 * curCenter - i], curIndex - i) : 1;

            while ((i - arrays[i]) >= 0 && (i + arrays[i] < stringBuilder.length())
                    && stringBuilder.charAt(i - arrays[i]) == stringBuilder.charAt(i + arrays[i])) {
                arrays[i] += 1;
            }

            if (arrays[i] > curCenter) {
                curCenter = arrays[i];
                curIndex = i + arrays[i];
            }
            if (2 * arrays[i] + 1 > maxLength) {
                maxLength = 2 * arrays[i] - 1;
                start = i - arrays[i] + 1;
            }
        }

        return stringBuilder.substring(start, start + maxLength).replace("#", "");
    }

    // 动态规划
    private static String solution3(String origin) {
        if (origin == null || origin.length() == 0) return "";
        int size = origin.length(), start = 0, resLength = 0;
        boolean[][] arrays = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j + i < size; j++) {

                if (origin.charAt(j) == origin.charAt(j + i) && (i - j < 2 || arrays[j + 1][i - 1])) {
                    arrays[j][j + i] = true;
                }
                if (arrays[j][i] && i > resLength) {
                    start = j;
                    resLength = i;
                }
            }
        }
        return origin.substring(start, start + resLength + 1);
    }

    // 中心扩展法
    private static String solution2(String origin) {
        if (origin == null || origin.length() == 0) return "";

        int start = 0, resLength = 0, size = origin.length();
        for (int i = 0; i < size; i++) {
            int[] res = new int[2];
            isPalindrome(origin, i, i, res);
            if (res[1] > resLength) {
                start = res[0];
                resLength = res[1];
            }
            isPalindrome(origin, i, i + 1, res);
            if (res[1] > resLength) {
                start = res[0];
                resLength = res[1];
            }
        }
        return origin.substring(start, start + resLength);
    }

    private static void isPalindrome(String origin, int start, int end, int[] res) {
        while (start >= 0 && end < origin.length() && origin.charAt(start) == origin.charAt(end)) {
            res[0] = start;
            res[1] = end - start + 1;
            start--;
            end++;
        }
    }

    // 蛮力
    private static String solution1(String origin) {
        if (origin == null || origin.length() == 0) return "";
        int result = 0, length = origin.length();
        String resTemp = "";
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String cur = origin.substring(i, j);
                if (isPalindrome(cur) && cur.length() > result) {
                    result = cur.length();
                    resTemp = cur;
                }
            }
        }

        return resTemp;
    }

    private static boolean isPalindrome(String temp) {
        int start = 0, end = temp.length() - 1;
        while (start <= end) {
            if (temp.charAt(start) != temp.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
