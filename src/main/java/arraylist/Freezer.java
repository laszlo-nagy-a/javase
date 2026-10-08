package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> foodList = new ArrayList<>(5);
        foodList.add("apple");
        foodList.add("orange");
        foodList.add("banana");
        foodList.add("grape");
        foodList.add("pineapple");

        for(String food : foodList){
            System.out.println(food);
        }
        System.out.println(foodList.size());
    }
}
