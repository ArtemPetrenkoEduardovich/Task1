import java.util.HashMap;
import java.util.Map;

class Task {

    // Task 1.1
    static int[] interviewArray(int[] array, int shift) {
        int srcArraySize = array.length;
        int[] resultArray = new int[srcArraySize];

        if (shift == 0)
            return array;
        if (shift > 0) {
            for (int i = 0; i < srcArraySize-shift; i++)
                resultArray[i] = array[i+shift];

            for (int i = 0; i < shift; i++)
                resultArray[srcArraySize - shift + i] = array[i];
        } else {
            shift *= -1; // or Math.abc()
            for (int i = 0; i < srcArraySize - shift; i++)
                resultArray[i + shift] = array[i];

            for (int i = 0; i < shift; i++)
                resultArray[i] = array[srcArraySize - shift + i];
        }

        return resultArray;
    }


    // Task 1.1
    /*
    static int[] interviewArray(int[] array, int shift) {
        int srcArraySize = array.length;
        int[] resultArray = new int[srcArraySize];

        if (shift == 0)
            return array;
        if (shift > 0) {
            System.arraycopy(array, shift, resultArray, 0, srcArraySize - shift);
            System.arraycopy(array, 0, resultArray, srcArraySize - shift, shift);
        } else {
            System.arraycopy(array, 0, resultArray,  -1 * shift, srcArraySize + shift);
            System.arraycopy(array, srcArraySize + shift, resultArray, 0, shift * -1);
        }

        return resultArray;
    }
    */


    // Task 1.2
    static String interviewRecursion(String line) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

        if (line.length() == 1)
            return line;

        for (char vowel : vowels) {
            if (line.charAt(0) == vowel || (line.charAt(0) != '*' && line.charAt(1) == vowel)){
                line = line.charAt(0) + "*" + line.substring(1);
                return line.substring(0, 2) + interviewRecursion(line.substring(2));
            }
        }
        return line.charAt(0) + interviewRecursion(line.substring(1));
    }

    // Task 1.3
    static Map<String, Integer> interviewMap(String[] array) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String str : array) {
            Integer frequency = map.get(str);
            map.put(str, frequency == null ? 1 : frequency + 1);
        }
        return map;
    }
}










//stringBuilder.ensureCapacity(stringBuilder.capacity() + 100);

//char[] charArray = line.toCharArray();