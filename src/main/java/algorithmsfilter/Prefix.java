package algorithmsfilter;

import java.util.ArrayList;
import java.util.List;

public class Prefix {

    public static void main(String[] args) {
        System.out.println(getWordsStartWith(List.of("kakao", "karamell", "sajt", "gitar"), "ka"));
    }

    static List<String> getWordsStartWith(List<String> words, String prefix) {
        List<String> foundWords = new ArrayList<>();

        for (String word : words) {
            if(word.startsWith(prefix)) {
                foundWords.add(word);
            }
        }

        return foundWords;
    }
}
