package arraylist;

import java.util.Arrays;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {
        String[] availableWordsArray = {"KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ", "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA"};
        List<String> availableWordsList = Arrays.asList(availableWordsArray);

        for(String word :availableWordsList){
            if(word.length() == 6) {
                System.out.println(word);
            }
        }
    }
}
