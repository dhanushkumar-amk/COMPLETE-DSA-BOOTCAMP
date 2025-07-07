package SYSTEM_DESIGN.OOPS;

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


 class HouseMain{

    public static void main(String[] args){

    }
}
