package OOPS.SINGLETONCLASS;

public class SingletonClass {

   String name;
    SingletonClass(String name) {
        this.name = "dhanush";
    }

    private static SingletonClass instance;

    public static SingletonClass getInstance(){
        // check whether 1 obj only is created or not

        if (instance == null){
            instance = new SingletonClass(instance.name);
        }
        return instance;
    }

}
