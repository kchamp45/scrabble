import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/1/17.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the letters you of the word you spelled in Scrabble:");

        try {
            String userInput = bufferedReader.readLine();
            char InputNow[] = userInput.toCharArray();
            for (int i = 0; i < InputNow.length; i++) {
                int calculateScore(InputNow[i]);
            }
        }
        catch(IOException e)
        { e.printStackTrace();
        }
    }
}
