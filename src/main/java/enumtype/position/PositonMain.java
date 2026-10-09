package enumtype.position;

public class PositonMain {
    public static void main(String[] args) {
        Position po1 = Position.PO;
        System.out.println(po1.name());

        for(Position pos : Position.values()) {
            System.out.println(pos);
        }

        Position administrator = Position.valueOf("ADMINISTRATOR");
        System.out.println(administrator);

        Position po2 = Position.valueOf("PO");
        System.out.println(po1 == po2);

        System.out.println(po1.ordinal() > administrator.ordinal());
    }
}
