package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class Message {
    public static void main(String[] args) {

        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32", "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");

        char[] charsArray = new char[codedMessage.size()];
        for(int i = 0; i < codedMessage.size(); i++) {
            Integer codeAsInteger = Integer.parseInt(codedMessage.get(i));
            charsArray[i] = (char) codeAsInteger.intValue();
        }

        System.out.println(charsArray);

        //find the cause of exception and fix it
        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "1O1", "110", "101", "116", "46");
        char[] anotherCharsArray = new char[anotherCodedMessage.size()];
        for(int i = 0; i < anotherCodedMessage.size(); i++) {
            Integer codeAsInteger = Integer.parseInt(anotherCodedMessage.get(i));
            anotherCharsArray[i] = (char) codeAsInteger.intValue();
        }

        System.out.println(anotherCharsArray);
    }
}
