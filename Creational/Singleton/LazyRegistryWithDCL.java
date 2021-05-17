package Creational.Singleton;

public class LazyRegistryWithDCL {
    
    private LazyRegistryWithDCL(){}

    // volatile IMPORTANT!
    private static volatile LazyRegistryWithDCL INSTANCE;

    public static LazyRegistryWithDCL getInstance(){
        if (INSTANCE == null){
            synchronized(LazyRegistryWithDCL.class){
                if (INSTANCE == null){
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }
}
