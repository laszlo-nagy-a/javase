package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("noteName");
        note.setText("noteText");
        note.setTopic("noteTopic");

        System.out.println(note.getNoteText());
    }
}
