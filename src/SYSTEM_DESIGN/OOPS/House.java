package SYSTEM_DESIGN.OOPS;

import java.util.ArrayList;
import java.util.Arrays;

interface QualityRules {
    boolean passTest();
    boolean Accessibility();
}

interface houseQualityRules extends QualityRules{
    void solidLand();
}

public abstract class House implements houseQualityRules {
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
}

class DhanushsHouse extends  House {
    void print() {
        System.out.println("It is a dhanushshouse");
    }
}

class ArunssHouse extends  House {
    void print() {
        System.out.println("It is a arunsHouse");
    }
}


 class HouseBuilder{

    public static void main(String[] args){
        ArrayList<House> houses = new ArrayList<>();
        houses.add(new DhanushsHouse());
        houses.add(new ArunssHouse());

        for(House house : houses ){
            System.out.println(house.print());
        }
    }
}
