package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg az első számot: ");
        int firstNum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Add meg a második számot: ");
        int secondNum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Add meg az írásjelet, hogy mit szeretnél csinálni a két számmal (+, - , *, %, /): ");
        String operation = scanner.nextLine();

        switch(operation) {
            case "+":
                System.out.println("A két szám összege: " + (firstNum + secondNum));
                break;
            case "-":
                System.out.println("A két szám különbözete " + (firstNum - secondNum));
                break;
            case "*":
                System.out.println("A két szám szorzata: " + (firstNum * secondNum));
                break;
            case "%":
                try{
                    System.out.println("A két szám maradékos osztásának eredménye: " + (firstNum % secondNum));
                } catch (ArithmeticException e) {
                    System.out.println("A megadott számmal nem lehet osztani!");
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
                break;
            case "/":
                try {
                    System.out.println("A két szám osztaléka: " + (firstNum / secondNum));
                } catch (ArithmeticException e) {
                    System.out.println("A megadott számmal nem lehet osztani!");
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("A megadott művelet nem elérhető.");
        }

    }


}
