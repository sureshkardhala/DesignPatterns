package Singleton;
/*
    Creating or Instantiating object in its demand
 */
public class LazyLoading {
    private static LazyLoading lazyLoading = null;
    private LazyLoading(){};
    public static LazyLoading getLazyLoading(){
        if(lazyLoading==null) lazyLoading = new LazyLoading();
        return lazyLoading;
    }
}
