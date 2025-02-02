package HASHMAPS;



public class OwnHashImplementation {

    private Entity[] entities;

    public OwnHashImplementation() {
        this.entities = new Entity[100];
    }

    //put method
    public void put(String key, String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key,value);
    }

    // get method
    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);

        if (entities[hash] != null && entities[hash].key.equals(key))
            return entities[hash].value;

        return null;
    }


    // remove method
    public void  remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);

        if (entities[hash] != null && entities[hash].key.equals(key))
            entities[hash] = null;
    }


 private class Entity{
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

class Main{
    public static void main(String[] args) {
        OwnHashImplementation map = new OwnHashImplementation();
        map.put("dhanush", "developer");
        map.put("ram", "designer");
        map.put("kunal", "engineer");

        System.out.println(map.get("dhanush"));
    }
}
