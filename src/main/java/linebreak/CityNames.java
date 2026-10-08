package linebreak;

public class CityNames {
    public static void main(String[] args) {
        String systemLineSeparator = System.lineSeparator();
        System.out.print(
                "Budapest" + systemLineSeparator +
                "Szeged" + systemLineSeparator +
                "Kecskemét"
        );
    }
}
