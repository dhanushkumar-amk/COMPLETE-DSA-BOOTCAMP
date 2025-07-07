package SYSTEM_DESIGN.OOPS;

import java.util.ArrayList;

interface QualityRules {
    boolean passTest();
    boolean Accessibility();
}

interface HouseQualityRules extends QualityRules {
    void solidLand();
}

public abstract class House implements HouseQualityRules {
    @Override
    public void solidLand() {
        System.out.println("It is a solid land");
    }

    @Override
    public boolean Accessibility() {
        return false;
    }

    @Override
    public boolean passTest() {
        return true;
    }

    public abstract void print();
}

class DhanushsHouse extends House {
    @Override
    public void print() {
        System.out.println("It is a Dhanush's house");
    }
}

class ArunssHouse extends House {
    @Override
    public void print() {
        System.out.println("It is Arun's house");
    }

}

class HouseBuilder {
    public static void main(String[] args) {
        ArrayList<House> houses = new ArrayList<>();
        houses.add(new DhanushsHouse());
        houses.add(new ArunssHouse());

        for (House house : houses) {
            house.print();  // Correct way to call a void method
        }
    }
}
