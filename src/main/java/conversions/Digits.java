package conversions;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Digits {

    private List<Integer> intNumbers = new ArrayList<>();

    public List<Integer> getIntNumbers() {
        return intNumbers;
    }

    void addDigitsToList(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(Character.isDigit(chars[i])) {
                int number = Integer.parseInt(String.valueOf(chars[i]));
                intNumbers.add(number);
            }
        }
    }
}
