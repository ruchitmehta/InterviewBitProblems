package Strings;

/**
 * Created by ruchitmehta
 */
public class ReverseString {
    public static void main(String args[]){
        System.out.println(reverseWords("trying to understand and reverse   "));
    }

    public static String reverseWords(String A) {
        char [] array = A.toCharArray();
        int i;
        int n = A.length();

        for (i = 0; i < n; i++) {
            while (i < n && array[i] == ' ')
                i++;
            int start = i;
            int end = -1;
            while (i < n && array[i] != ' ')
                i++;
            end = i - 1;
            if (end < start)
                break;

            reverse(array, start, end);
        }

        reverse(array, 0, n - 1);

        return removeExtraSpaces(array);
    }

    public static String removeExtraSpaces(char [] array) {
        int n = array.length;
        int index = 0;
        boolean cond = false;

        for (int i = 0; i < n;) {

            if (array[i] != ' ') {
                array[index] = array[i];
                index++;
                cond = true;
            } else {
                if (cond)
                    array[index++] = ' ';
                cond = false;
            }

            i++;
        }

        if (index - 1 >= 0 && index - 1 < n && array[index - 1] == ' ')
            index--;

        return new String(array, 0, index);

    }


    public static void reverse(char [] array, int start, int end) {
        char temp;
        int i;

        for (i = 0; i < (end - start + 1) / 2; i++) {
            temp = array[start + i];
            array[start + i] = array[end - i];
            array[end - i] = temp;
        }

    }
}
