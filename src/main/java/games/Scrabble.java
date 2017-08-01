package games;


import java.util.HashMap;
import java.util.Map;

public class Scrabble {

    public Scrabble() {
        Map<Character, Integer> numbersAndLetters = new HashMap<Character, Integer>();
        char Group1[] = {'a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't'};
        for (int i = 0; i < Group1.length; i++) {
            numbersAndLetters.put(Group1[i], 1);
        }
        char[] Group2 = {'d', 'g'};
        for (int j = 0; j < Group2.length; j++) {
            numbersAndLetters.put(Group2[j], 2);
        }
        char[] Group3 = {'b', 'c', 'm', 'p'};
        for (int k = 0; k < Group3.length; k++) {
            numbersAndLetters.put(Group3[k], 3);
        }
        char[] Group4 = {'f', 'h', 'v', 'w', 'y'};
        for (int l = 0; l < Group4.length; l++) {
            numbersAndLetters.put(Group4[l], 4);
        }
        char[] Group5 = {'k'};
        for (int m = 0; m < Group5.length; m++) {
            numbersAndLetters.put(Group5[m], 5);
        }
        char[] Group6 = {'j', 'x'};
        for (int n = 0; n < Group6.length; n++) {
            numbersAndLetters.put(Group6[n], 8);
        }
        char[] Group7 = {'q', 'z'};
        for (int o = 0; o < Group7.length; o++) {
            numbersAndLetters.put(Group7[o], 10);
        }
    }

}
