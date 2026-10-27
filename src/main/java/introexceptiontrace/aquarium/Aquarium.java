package introexceptiontrace.aquarium;

import java.util.List;

public class Aquarium {

    private List<Fish> ornamentalFish;

    public List<Fish> getOrnamentalFish() {
        return ornamentalFish;
    }

    public void addFish(Fish fish) {
        ornamentalFish.add(fish);
    }

    public int getNumberOfFish() {
        return ornamentalFish.size();
    }

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Fish fish1 = new Fish("firstType", "red");
        Fish fish2 = new Fish("secondType", "green");
        Fish fish3 = new Fish("thirdType", "blue");
        Fish fish4 = new Fish("fourthType", "black");

        aquarium.addFish(fish1);
        aquarium.addFish(fish2);
        aquarium.addFish(fish3);
        aquarium.addFish(fish4);

        System.out.println(aquarium.getNumberOfFish());
    }
}
