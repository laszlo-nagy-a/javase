package algorithmscount;

import java.util.List;

public class Height {

    public static void main(String[] args) {
        System.out.println(countChildrenWithHeightGreaterThan(List.of(1, 2, 3, 4), 1));
    }

    static int countChildrenWithHeightGreaterThan(List<Integer> heigthList, int threshold) {
        int count = 0;
        for(Integer height : heigthList) {
            if(height > threshold) {
                count++;
            }
        }

        return count;
    }
}
