package calculator;

public class Util {
    public static boolean isDuplicate(Object[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i].equals(arr[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
