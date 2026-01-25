public class Function {
    public static String reverseChar(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (Character.isLetter(chars[left])) {
                if (Character.isLetter(chars[right])) {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                }
                right--;
            } else left++;
        }
        return new String(chars);
    }
}
