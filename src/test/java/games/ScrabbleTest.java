package games;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Guest on 8/1/17.
 */
public class ScrabbleTest {

        @Test
        public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
            Scrabble testScrabble = new Scrabble();
            Map<String, Integer> numbersAndLetters = new HashMap<String, Integer>();
            Integer expected = 1;
            assertEquals(expected, testScrabble.calculateScore("a"));
        }
        @Test
        public void calculateScore_returnsScoreForTwoLetter_2() throws Exception {
            Scrabble testScrabble = new Scrabble();
            Map<String, Integer> numbersAndLetters = new HashMap<String, Integer>();
            Integer expected = 2;
            assertEquals(expected, testScrabble.calculateScore("ae"));
    }
}


