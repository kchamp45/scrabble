import games.Scrabble;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Guest on 8/1/17.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the letters you of the word you spelled in Scrabble:");

        try {
            String userInput = bufferedReader.readLine();
            String userInputLowerCase = userInput.toLowerCase();
            Scrabble scrabble = new Scrabble();
            Integer scrabbleResults = scrabble.calculateScore(userInputLowerCase);
            System.out.println("Here is your score:" + scrabbleResults);
            }
        catch(IOException e)
        { e.printStackTrace();
        }
    }
}

