package linebreak;

public class Car {
    public static void main(String[] args) {
        System.out.println(getBrandAndTypeInSeparateLines("Fiat", "Bravo"));
    }

    public static String getBrandAndTypeInSeparateLines (String brand, String type){
        return brand + System.lineSeparator() + type;
    }
}
