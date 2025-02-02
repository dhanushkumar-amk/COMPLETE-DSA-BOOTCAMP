package HASHMAPS;



import java.util.*;

public class HashMapUsingLL<K, V> {

    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private float loadFactor = 0.5f;

    public HashMapUsingLL() {
        list = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {
            list.add(new LinkedList<>());
        }
    }

    // add function
    public  void put(K key, V value){
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities){
            if (entity.key.equals(key)){
                entity.value = (String) value;
                return;
            }
        }

        if ((float) (size) / list.size() >  loadFactor )
            reHash(); // double the size

            entities.add(new Entity((String) key, (String) value));

            size++;
    }

    //resize the hash
    private void reHash() {
        System.out.println("rehasing");

        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        size = 0;
        for (int i = 0; i <old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for (LinkedList<Entity> entries : old){
            for (Entity entry : entries){
                put((K) entry.key, (V) entry.value);
            }
        }
    }

    public class Entity{
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}


