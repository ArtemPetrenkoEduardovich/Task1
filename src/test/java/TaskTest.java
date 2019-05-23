import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @org.junit.jupiter.api.Test
    void interviewArray() {
        int[] actual = Task.interviewArray(new int[]{1,2,3,4,5,6,7,8,9}, 7);
        int[] expected = {8,9,1,2,3,4,5,6,7};
        assertArrayEquals(expected, actual);

        actual = Task.interviewArray(new int[]{1,2,3,4,5,6,7,8,9}, -4);
        expected = new int[]{6,7,8,9,1,2,3,4,5};
        assertArrayEquals(expected, actual);

        actual = Task.interviewArray(new int[]{6,2,5,3}, 2);
        expected = new int[]{5,3,6,2};
        assertArrayEquals(expected, actual);

        actual = Task.interviewArray(new int[]{1,2}, 1);
        expected = new int[]{2,1};
        assertArrayEquals(expected, actual);

        actual = Task.interviewArray(new int[]{1}, 1);
        expected = new int[]{1};
        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void interviewRecursion() {
        String actual = Task.interviewRecursion("ooaaihhghysdhkkjsna");
        String expected = "o*o*a*a*i*hhgh*y*sdhkkjsn*a";
        assertEquals(expected, actual);

        actual = Task.interviewRecursion("hello");
        expected = "h*e*ll*o";
        assertEquals(expected, actual);

        actual = Task.interviewRecursion("healo");
        expected = "h*e*a*l*o";
        assertEquals(expected, actual);

        actual = Task.interviewRecursion("abc");
        expected = "a*bc";
        assertEquals(expected, actual);

        actual = Task.interviewRecursion("oab");
        expected = "o*a*b";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void interviewMap() {
        Map<String, Integer> actual = Task.interviewMap(new String[]{"a", "bb", "a", "bb", "cc", "cc", "cc"});
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("a", 2);
        expected.put("cc", 3);
        expected.put("bb", 2);
        assertEquals(expected, actual);

        actual.clear();
        expected.clear();
        actual = Task.interviewMap(new String[]{"this", "and", "that", "and"});
        expected = new HashMap<String, Integer>();
        expected.put("this", 1);
        expected.put("that", 1);
        expected.put("and", 2);
        assertEquals(expected, actual);

        actual.clear();
        expected.clear();
        actual = Task.interviewMap(new String[]{"code", "code", "code", "bug"});
        expected = new HashMap<String, Integer>();
        expected.put("code", 3);
        expected.put("bug", 1);
        assertEquals(expected, actual);
    }
}