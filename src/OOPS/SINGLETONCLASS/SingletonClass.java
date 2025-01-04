package OOPS.SINGLETONCLASS;

public class SingletonClass {

//    public SingletonClass() {
//    }

    private static SingletonClass instance;

    public static SingletonClass getInstance(){
        // check whether 1 obj only is created or not

        if (instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }

}
