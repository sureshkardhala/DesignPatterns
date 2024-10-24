package Singleton;

/*
       1.Make static member of class type
       2.Make constructor as private to don't access from other class
       3.Create method to get instance
 */
public class CreateSingleton {
    private static CreateSingleton createSingleton = null;

    private CreateSingleton(){};

    public static CreateSingleton getCreateSingleton(){
        if(createSingleton == null) createSingleton = new CreateSingleton();
        return createSingleton;
    }
}
