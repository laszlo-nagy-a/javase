package introexceptionthrowjunit4;

import java.util.List;

public class Student {

    List<Integer> marks;

    public List<Integer> getMarks() {
        return marks;
    }

    public void addMark(int mark) {
        if(mark > 1 && mark <6) {
            marks.add(mark);
        } else {
            throw new IllegalArgumentException("Mark must be between 1 and 5!");
        }
    }
}
