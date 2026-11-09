package algorithmstransformation;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {

    public static void main(String[] args) {
        System.out.println(getFirstTwoLettersFromTheWords(List.of("Hello", "Darkness", "My", "Old", "Friend")));
    }

    static List<String> getFirstTwoLettersFromTheWords(List<String> words) {
        List<String> firstTwoLetterOfTheWords = new ArrayList<>();

        for(String word: words) {
            firstTwoLetterOfTheWords.add(
                    word.substring(0, 2)
            );
        }

        return firstTwoLetterOfTheWords;
    }
}
