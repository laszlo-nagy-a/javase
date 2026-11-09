package algorithmsmax;

import java.util.List;

public class Temerature {

    public static void main(String[] args) {
        System.out.println(getMin(List.of(1,2,3,5,-6)));
    }


    static int getMin(List<Integer> integerList) {
        int min = Integer.MAX_VALUE;

        for(Integer i : integerList) {
            if(min > i) {
                min = i;
            }
        }
        return min;
    }
}
