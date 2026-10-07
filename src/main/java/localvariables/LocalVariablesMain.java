package localvariables;

public class LocalVariablesMain {


    public static void main(String[] args) {
        boolean aBoolean = false;
        System.out.println(aBoolean);

        int two = 2;
        System.out.println(two);

        int i = 3;
        int j = 4;
        int k = i;
        System.out.println("i:" + i + " j:" + j + " k:" + k);

        String s = "Hello World";
        System.out.println(s);
        String t = s;
        System.out.println(t);

        {
            int x = 0;
            System.out.println(x);
            System.out.println("Out of block variables sum (i+j+k)=" + i + "+" + j + "+" + k);
        }

    }
}
