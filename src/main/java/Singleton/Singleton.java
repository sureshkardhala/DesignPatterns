package Singleton;

/*
       Instantiation of a class has only one object. Only that object has to use throughout the application.
 */
public class Singleton {
    public static void main(String[] args) {
        //Creating Singleton
        CreateSingleton createSingleton1 = CreateSingleton.getCreateSingleton();
        CreateSingleton createSingleton2 = CreateSingleton.getCreateSingleton();

        System.out.println(createSingleton1.hashCode());
        System.out.println(createSingleton2.hashCode());

        System.out.println();

        //EagerLoading
        EagerLoading eagerLoading1 = EagerLoading.getEagerLoading();
        EagerLoading eagerLoading2 = EagerLoading.getEagerLoading();
        System.out.println("eagerLoading1 : " + eagerLoading1.hashCode());
        System.out.println("eagerLoading2 : " + eagerLoading2.hashCode());

        System.out.println();

        //LazyLoading
        LazyLoading lazyLoading1 = LazyLoading.getLazyLoading();
        LazyLoading lazyLoading2 = LazyLoading.getLazyLoading();

        System.out.println("LazyLoading1 : " + lazyLoading1.hashCode());
        System.out.println("LazyLoading2 : " + lazyLoading2.hashCode());




    }
}
