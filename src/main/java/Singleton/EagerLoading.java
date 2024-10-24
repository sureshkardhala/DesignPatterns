package Singleton;

/*\
     We are instantiating before it's demand
 */
public class EagerLoading {
    private static EagerLoading eagerLoading = new EagerLoading();

    private EagerLoading(){}

   public static EagerLoading getEagerLoading(){
        return eagerLoading;
   }
}
